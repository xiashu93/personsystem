package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.entity.User;

public interface EmployeeService {

    //查询分页
    PageVo<Employee> queryPage(int page, int limit);
}
