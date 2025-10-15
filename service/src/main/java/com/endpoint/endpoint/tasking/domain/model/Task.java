package com.endpoint.endpoint.tasking.domain.model;

import com.endpoint.endpoint.tasking.domain.model.problem.TaskInvalid;

import java.util.Objects;

public class Task {

    private final String taskName;
    private final String taskDescription;

    public Task(String taskName, String taskDescription) {

        if (Objects.isNull(taskName) || taskName.isBlank()) {
            throw new TaskInvalid("Task must have a name.");
        }

        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
}
