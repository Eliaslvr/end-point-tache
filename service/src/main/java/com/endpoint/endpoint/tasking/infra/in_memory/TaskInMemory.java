package com.endpoint.endpoint.tasking.infra.in_memory;

import com.endpoint.endpoint.tasking.domain.model.Task;
import com.endpoint.endpoint.tasking.domain.model.port.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskInMemory implements TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    @Override
    public void save(Task task) {
        this.tasks.add(task);
    }

    @Override
    public List<Task> allTasks() {
        return List.copyOf(tasks);
    }
}
