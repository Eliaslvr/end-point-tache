package com.endpoint.endpoint.tasking.domain.use_cases.add_task;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.model.port.TaskRepository;
import org.springframework.stereotype.Component;

@Component
public class AddTaskUseCase {

    private final TaskRepository taskRepository;

    public AddTaskUseCase(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task execute(AddTask command) {
        final Task task = new Task(command.getTaskName(), command.getTaskDescription());
        taskRepository.save(task);
        return task;
    }
}
