package com.example.progress_study_backend.controller;

import com.example.progress_study_backend.model.Subject;
import com.example.progress_study_backend.service.SubjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> subjectList(){
        return subjectService.getAllSubjects();
    }
}
