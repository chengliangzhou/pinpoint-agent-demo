package com.sino.test.producer.service.salary.impl;

import com.sino.common.dto.Salary;
import com.sino.common.service.ISalaryService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

/**
 * @author zhouchengliang
 * @description 薪水service
 * @date 2019-09-09
 **/
@Service(value = "salaryService")
public class SalaryServiceImpl implements ISalaryService {
    @Override
    public Salary findSalaryByName(String name) {
        if(StringUtils.isEmpty(name)){
            return new Salary();
        }
        switch (name){
            case "a":
                return new Salary("tom", new BigDecimal("12001.2"));
            case "b":
                return new Salary("jack", new BigDecimal("8913.9"));
            case "c":
                return new Salary("mary", new BigDecimal("7800"));
            default:break;
        }
        return new Salary();
    }
}
