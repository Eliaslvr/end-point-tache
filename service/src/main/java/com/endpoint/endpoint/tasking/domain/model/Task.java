package com.endpoint.endpoint.tasking.domain.model;

import com.endpoint.endpoint.tasking.domain.model.problem.TaskInvalid;

import java.util.Objects;
import java.util.UUID;

public class Task {

    private final String id;
    private final String taskName;
    private final String taskDescription;

    public Task(String taskName, String taskDescription) {

        this.id = UUID.randomUUID().toString();
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}