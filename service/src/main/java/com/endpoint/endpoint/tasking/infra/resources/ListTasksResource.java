package com.endpoint.endpoint.tasking.infra.resources;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.model.TaskListing;
import com.endpoint.endpoint.tasking.domain.use_cases.list_task.ListTasksUseCase;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class ListTasksResource {

    private final ListTasksUseCase useCase;

    public ListTasksResource(ListTasksUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<TaskDto>> addtask() {
        TaskListing taskListing = useCase.execute();
        List<TaskDto> tasks = taskListing.tasks()
                .stream()
                .map(TaskDto::from)
                .toList();
        return ResponseEntity.ok(tasks);
    }

    @Data
    public static class TaskDto {

        private final String id;
        private final String name;
        private final String description;

        public TaskDto(String id, String name, String description) {
            this.id = id;
            this.name = name;
            this.description = description;
        }

        public static TaskDto from(Task task) {
            return new TaskDto(task.getId(), task.getTaskName(), task.getTaskDescription());
        }
    }
}