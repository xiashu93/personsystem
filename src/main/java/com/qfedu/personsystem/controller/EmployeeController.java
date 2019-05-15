package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
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


    //分页展示所有
    @RequestMapping("emplistByPage.do")
    public PageVo<Employee> goodspage(int page, int limit){
        return employeeService.queryPage(page,limit);

    }

    //删除方法
    @RequestMapping("empDelete.do")
    public ResultVo delete(int eid) {
        return employeeService.deleteById(eid);
    }

    //动态修改
    @RequestMapping("empUpdate.do")
    public ResultVo update(Employee employee) {
        return employeeService.updateById(employee);
    }

    //展示所有员工
    @RequestMapping("empList.do")
    public ResultVo findAll() {
        return employeeService.findAllEmp();
    }

    //添加
    @RequestMapping("empAdd.do")
    public ResultVo save(Employee employee) {
        return employeeService.save(employee);
    }

    //根据id进行查询
    @RequestMapping("empSelectById.do")
    public ResultVo findById(int eid) {
        return employeeService.findById(eid);
    }

    //最后展示所有员工
    @RequestMapping("eList.do")
    public ResultVo sAll() {
        return employeeService.sallEmp();
    }
}
