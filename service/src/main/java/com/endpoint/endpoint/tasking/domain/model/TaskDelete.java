package com.endpoint.endpoint.tasking.domain.model;

import java.util.ArrayList;
import java.util.List;

public class TaskDelete {

    private final List<Task> tasks;

    private TaskDelete(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static TaskDelete of(List<Task> tasks) {
        return new TaskDelete(tasks);
    }

    public List<Task> tasks() {
        return new ArrayList<>(tasks);
    }
}
