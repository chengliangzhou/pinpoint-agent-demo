package com.sino.common.service;

import com.sino.common.dto.Salary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhouchengliang
 * @description
 * @date
 **/
@FeignClient(name = "producer", path = "salary")
public interface ISalaryService {
    @RequestMapping(value = "findSalaryByName", method = RequestMethod.GET)
    Salary findSalaryByName(@RequestParam(value = "name", required = false) String name);
}

