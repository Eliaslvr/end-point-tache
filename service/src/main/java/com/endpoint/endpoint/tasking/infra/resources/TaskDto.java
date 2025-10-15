package com.endpoint.endpoint.tasking.infra.resources;

import com.endpoint.endpoint.tasking.domain.model.Task;
import lombok.Data;

@Data
public class TaskDto {

    private final String name;
    private final String description;

    public TaskDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static TaskDto from(Task task) {
        return new TaskDto(task.getTaskName(), task.getTaskDescription());
    }
}
