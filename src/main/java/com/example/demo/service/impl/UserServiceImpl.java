package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
//@Service注解将该类标记为一个服务组件，表示它提供业务逻辑的实现
public class UserServiceImpl implements UserService {
    @Autowired
//    @Autowired注解将UserRepository注入到该类中，以便在需要时进行数据访问操作。
    private UserRepository userRepository;

    @Override
    public User findByPhone(String phone) {
        return userRepository.findByPhone(phone);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
