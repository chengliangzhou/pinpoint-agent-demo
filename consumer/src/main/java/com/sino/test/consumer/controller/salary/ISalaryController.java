package com.sino.test.consumer.controller.salary;


import com.sino.common.dto.Salary;

public interface ISalaryController {
    Salary findSalaryByName(String name);
}
