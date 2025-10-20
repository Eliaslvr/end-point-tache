package com.endpoint.endpoint.tasking.domain.model;

import java.util.ArrayList;
import java.util.List;

public class TaskListing {

    private final List<Task> tasks;

    private TaskListing(List<Task> tasks) {
        this.tasks = tasks;
    }

    public static TaskListing of(List<Task> tasks) {
        return new TaskListing(tasks);
    }

    public List<Task> tasks() {
        return new ArrayList<>(tasks);
    }

    public TaskListing addTask(Task taskToAdd) {
        final List<Task> copyOfAllTasks = new ArrayList<>(tasks);
        copyOfAllTasks.add(taskToAdd);
        return new TaskListing(copyOfAllTasks);
    }
}
