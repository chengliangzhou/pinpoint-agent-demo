package com.sino.common.service;

import com.sino.common.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "producer")
public interface IUserService {
    @RequestMapping(value = "findUserByName")
    User findUserByName(String name);
}
