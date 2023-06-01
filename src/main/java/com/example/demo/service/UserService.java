package com.example.demo.service;

import com.example.demo.entity.User;
// 这个是个接口文件,定义了user服务可能会用到的操作
public interface UserService {
    User findByPhone(String phone);
    void save(User user);
}