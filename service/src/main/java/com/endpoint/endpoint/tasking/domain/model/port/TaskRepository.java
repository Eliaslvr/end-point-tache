package com.endpoint.endpoint.tasking.domain.model.port;

import com.endpoint.endpoint.tasking.domain.model.Task;

import java.util.List;

public interface TaskRepository {

    void save(Task task);

    List<Task> allTasks();
}
