package com.sino.test.consumer.controller.salary.impl;

import com.sino.common.dto.Salary;
import com.sino.common.service.ISalaryService;
import com.sino.test.consumer.controller.salary.ISalaryController;
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
        //像调用本地接口一样引用远程微服务接口
        return salaryService.findSalaryByName(name);
    }
}
