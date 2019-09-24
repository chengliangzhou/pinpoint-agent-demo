package com.sino.test.producer.controller.user.impl;

import com.sino.common.dto.User;
import com.sino.common.service.IUserService;
import com.sino.test.producer.controller.user.IUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhouchengliang
 * @description 用户controller
 * @date 2019-09-09
 **/
@RestController
@RequestMapping(value = "user")
public class UserControllerImpl implements IUserController {

    @Autowired
    private IUserService userService;

    @Override
    @RequestMapping(value = "findUserByName", method = RequestMethod.GET)
    @ResponseBody
    public User findUserByName(@RequestParam(value = "name", required = false) String name) {
        return userService.findUserByName(name);
    }
}
