package com.sino.test.producer.controller.user;


import com.sino.common.dto.User;

public interface IUserController {
    User findUserByName(String name);
}
