package com.service;

import com.model.entity.User;

/**
 * @Description:
 * @Author: QiuQiang
 * @Date: 2021-04-01
 */
public interface UserService {

    // 根据id获取用户信息
    User getUserById(Integer id);

}
