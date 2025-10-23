package com.endpoint.endpoint.tasking.domain.model.problem;

public class TaskNotFound extends RuntimeException {
    public TaskNotFound(String message) {
        super(message);
    }
}
