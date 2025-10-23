package com.endpoint.endpoint.tasking.infra.resources;

import com.endpoint.endpoint.tasking.domain.model.problem.TaskNotFound;
import com.endpoint.endpoint.tasking.domain.use_cases.delete_task.DeleteTask;
import com.endpoint.endpoint.tasking.domain.use_cases.delete_task.DeleteTaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class DeleteTaskResource {

    private final DeleteTaskService useCase;

    public DeleteTaskResource(DeleteTaskService useCase) {
        this.useCase = useCase;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable String id) {
        try {
            DeleteTask deleteTask = new DeleteTask(id);
            useCase.execute(deleteTask);
            return ResponseEntity.ok().body("Tâche supprimée avec succès");
        } catch (TaskNotFound e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }
}