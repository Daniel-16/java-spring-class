package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
}
