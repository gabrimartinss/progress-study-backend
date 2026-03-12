package com.example.progress_study_backend.service;

import com.example.progress_study_backend.dto.TaskDTO;
import com.example.progress_study_backend.model.Subject;
import com.example.progress_study_backend.model.Task;
import com.example.progress_study_backend.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskDTO> getByCreatedAt() {
        return taskRepository.findCreatedAt();
    }

}
