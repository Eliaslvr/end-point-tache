package com.endpoint.endpoint.tasking.domain.use_cases.delete_task;

public class DeleteTask {
    private final String taskId;

    public DeleteTask(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskId() {
        return taskId;
    }
}