package com.sino.test.producer.controller.salary.impl;

import com.sino.common.dto.Salary;
import com.sino.common.service.ISalaryService;
import com.sino.test.producer.controller.salary.ISalaryController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhouchengliang
 * @description 薪水controller
 * @date 2019-09-09
 **/
@RestController
@RequestMapping(value = "salary")
public class SalaryControllerImpl implements ISalaryController {

    @Autowired
    private ISalaryService salaryService;

    @Override
    @RequestMapping(value = "findSalaryByName", method = RequestMethod.GET)
    @ResponseBody
    public Salary findSalaryByName(@RequestParam(value = "name", required = false) String name) {
        return salaryService.findSalaryByName(name);
    }
}
