package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.entity.User;
import com.qfedu.personsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("emplistByPage.do")
    public PageVo<Employee> goodspage(int page, int limit){
        return employeeService.queryPage(page,limit);

    }
}
