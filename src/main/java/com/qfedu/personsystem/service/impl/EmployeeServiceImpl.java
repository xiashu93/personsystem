package com.qfedu.personsystem.service.impl;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.dao.EmployeeMapper;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public PageVo<Employee> queryPage(int page, int limit) {
        return ResultUtil.exec(page,limit,employeeMapper.queryCount(),employeeMapper.queryByPage((page-1)*limit,limit));
    }
}
