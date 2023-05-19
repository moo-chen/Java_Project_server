package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.common.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    // 注册
    @PostMapping("/register")
    public Result<String> register(@RequestBody User user) {
        // 检查手机号是否已存在
        if (userService.findByTelephone(user.getTelephone()) != null) {
            return Result.fail("手机号已存在");
        }
        userService.save(user);
        System.out.println("111");
        return Result.success("注册成功");
    }

    // 登录
    @PostMapping("/login")
    public Result<String> login(@RequestBody User user) {
        String telephone = user.getTelephone();
        String password = user.getPassword();
        User user_ = userService.findByTelephone(telephone);
        if (user_ == null) {
            return Result.fail("手机号不存在");
        }
        if (!user.getPassword().equals(password)) {
            return Result.fail("密码不匹配");
        }
        return Result.success("登录成功");
    }
}