package com.sino.test.producer.service.user.impl;

import com.sino.common.dto.User;
import com.sino.common.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author zhouchengliang
 * @description 用户service
 * @date 2019-09-09
 **/
@Service
public class UserServiceimpl implements IUserService {
    @Override
    public User findUserByName(String name) {
        if(StringUtils.isEmpty(name)){
            return new User();
        }
        switch (name){
            case "a":
                return new User("tom", 18, "address-sample-1");
            case "b":
                return new User("jack", 22, "address-sample-2");
            case "c":
                return new User("mary", 31, "address-sample-3");
            default:break;
        }
        return new User();
    }
}
