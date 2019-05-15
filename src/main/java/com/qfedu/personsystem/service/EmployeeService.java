package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.entity.User;

public interface EmployeeService {

    //查询分页
    PageVo<Employee> queryPage(int page, int limit);

    //删除
    ResultVo deleteById(Integer id);

    //动态修改员工，不修改部门、职位
    ResultVo updateById(Employee employee);

    //展示所有员工数据
    ResultVo findAllEmp();

    //动态添加
    ResultVo save(Employee employee);

    //根据id进行查询
    ResultVo findById(Integer id);

    //最后展示所有员工数据
    ResultVo sallEmp();
}
