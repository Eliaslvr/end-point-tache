package com.endpoint.endpoint.tasking.domain.use_cases.delete_task;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.model.port.TaskRepository;
import com.endpoint.endpoint.tasking.domain.model.problem.TaskNotFound;
import org.springframework.stereotype.Component;

@Component
public class DeleteTaskService {

    private final TaskRepository taskRepository;

    public DeleteTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task execute(DeleteTask command) {
        // Vérifie si la tâche existe
        Task taskToDelete = taskRepository.findById(command.getTaskId())
                .orElseThrow(() -> new TaskNotFound("Tâche non trouvée avec l'id : " + command.getTaskId()));

        // Supprime la tâche
        taskRepository.deleteById(command.getTaskId());

        // Retourne la tâche supprimée (optionnel)
        return taskToDelete;
    }
}
