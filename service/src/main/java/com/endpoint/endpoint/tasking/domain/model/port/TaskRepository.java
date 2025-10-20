package com.endpoint.endpoint.tasking.domain.model.port;

import com.endpoint.endpoint.tasking.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    void save(Task task);

    List<Task> allTasks();

    Optional<Task> findById(String id);

    void deleteById(String id);
}
