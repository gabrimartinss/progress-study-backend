package com.example.progress_study_backend.repository;

import com.example.progress_study_backend.dto.TaskDTO;
import com.example.progress_study_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT new com.example.progress_study_backend.dto.TaskDTO(task.name, task.createdAt) " +
            "FROM Task task " +
            "ORDER BY task.createdAt DESC")
    List<TaskDTO> findCreatedAt();
}
