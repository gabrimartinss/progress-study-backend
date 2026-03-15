package com.example.progress_study_backend.controller;

import com.example.progress_study_backend.model.User;
import com.example.progress_study_backend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestBody Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

