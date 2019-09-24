package com.sino.test.producer.controller.salary;


import com.sino.common.dto.Salary;

public interface ISalaryController {
    Salary findSalaryByName(String name);
}
