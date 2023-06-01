package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User findByPhone(String phone);
    void save(User user);
}