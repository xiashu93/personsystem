package com.qfedu.personsystem.service.impl;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.EmployeeMapper;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public PageVo<Employee> queryPage(int page, int limit) {
        return ResultUtil.exec(page,limit,employeeMapper.queryCount(),employeeMapper.queryByPage((page-1)*limit,limit));
    }

    @Override
    public ResultVo deleteById(Integer id) {
        employeeMapper.deleteById(id);
        return  ResultUtil.exec(true,"OK",null);
    }

    @Override
    public ResultVo updateById(Employee employee) {
        employeeMapper.updateById(employee);
        return ResultUtil.exec(true,"OK",null);
    }

    @Override
    public ResultVo findAllEmp() {
        List<Employee> list = employeeMapper.selectAll();
        return ResultUtil.exec(true,"OK",list);
    }

    @Override
    public ResultVo save(Employee employee) {
        employeeMapper.insertSelective(employee);
        return ResultUtil.exec(true,"OK",null);
    }

    @Override
    public ResultVo findById(Integer id) {
        Employee employee = employeeMapper.selectById(id);
        return ResultUtil.exec(true,"OK",employee);
    }
}
