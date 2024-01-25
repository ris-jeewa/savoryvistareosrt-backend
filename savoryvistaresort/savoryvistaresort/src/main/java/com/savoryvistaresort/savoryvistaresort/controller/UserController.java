package com.savoryvistaresort.savoryvistaresort.controller;

import com.savoryvistaresort.savoryvistaresort.entity.User;
import com.savoryvistaresort.savoryvistaresort.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/user")
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok(service.createUser(user));
    }

    @PostMapping("/users")
    public ResponseEntity<List<User>> createUsers(@RequestBody List<User> users){
        return  ResponseEntity.ok(service.createUsers(users));
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser(){
        return ResponseEntity.ok(service.getUsers());
    }
}
