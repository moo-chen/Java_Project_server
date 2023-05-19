package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User findByTelephone(String telephone);
    void save(User user);
}