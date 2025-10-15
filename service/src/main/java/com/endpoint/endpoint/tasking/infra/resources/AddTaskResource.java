package com.endpoint.endpoint.tasking.infra.resources;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.use_cases.add_task.AddTask;
import com.endpoint.endpoint.tasking.domain.use_cases.add_task.AddTaskUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks/add")
public class AddTaskResource {

    private final AddTaskUseCase useCase;

    public AddTaskResource(AddTaskUseCase useCase) {
        this.useCase = useCase;
    }

    @PutMapping
    public ResponseEntity<Task> addtask() {
        final AddTask addTask = new AddTask("Test", "blablabla");
        final Task addedTask = useCase.execute(addTask);
        return ResponseEntity.ok(addedTask);
    }
}
