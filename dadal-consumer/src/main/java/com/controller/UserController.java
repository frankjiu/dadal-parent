package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.UserService;

/**
 * @Description:
 * @Author: QiuQiang
 * @Date: 2021-04-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(interfaceClass = UserService.class, timeout = 30000)
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        return user;
    }
}