package com.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.model.entity.User;
import org.springframework.stereotype.Component;
import com.service.UserService;

/**
 * @Description:
 * @Author: QiuQiang
 * @Date: 2021-04-01
 */
@Component
@Service(interfaceClass = UserService.class, timeout = 30000)
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = User.builder()
                .id(id)
                .name("frank")
                .age(30 + id)
                .build();

        return user;
    }
}