package com.endpoint.endpoint.tasking.domain.use_cases.add_task;

public class AddTask {

    private final String taskName;
    private final String taskDescription;

    public AddTask(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
}
