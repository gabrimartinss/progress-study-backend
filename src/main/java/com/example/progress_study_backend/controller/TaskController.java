package com.example.progress_study_backend.controller;

import com.example.progress_study_backend.dto.TaskDTO;
import com.example.progress_study_backend.model.Task;
import com.example.progress_study_backend.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/createdAt")
    public List<TaskDTO> getByCreatedAt() {
        return taskService.getByCreatedAt();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@RequestBody Long id){
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
