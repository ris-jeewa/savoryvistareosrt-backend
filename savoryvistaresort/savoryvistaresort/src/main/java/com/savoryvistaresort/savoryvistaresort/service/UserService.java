package com.savoryvistaresort.savoryvistaresort.service;

import com.savoryvistaresort.savoryvistaresort.entity.User;
import com.savoryvistaresort.savoryvistaresort.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> createUsers(List<User> users) {
        return repository.saveAll(users);
    }

    public List<User> getUsers() {
        return repository.findAll();
    }
}


