package com.endpoint.endpoint.tasking.domain.use_cases.list_task;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.model.TaskListing;
import com.endpoint.endpoint.tasking.domain.model.port.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListTasksUseCase {

    private final TaskRepository taskRepository;

    public ListTasksUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskListing execute() {
        List<Task> tasks = taskRepository.allTasks();
        return TaskListing.of(tasks);
    }
}