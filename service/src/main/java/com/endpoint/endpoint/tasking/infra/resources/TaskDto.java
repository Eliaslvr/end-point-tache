package com.endpoint.endpoint.tasking.infra.resources;

import com.endpoint.endpoint.tasking.domain.model.Task;
import lombok.Data;

@Data
public class TaskDto {

    private final String id;
    private final String name;
    private final String description;

    public TaskDto(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static TaskDto from(Task task) {
        return new TaskDto(task.getId(), task.getTaskName(), task.getTaskDescription());

    }
}