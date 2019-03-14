package com.qfedu.personsystem.service.impl;


import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.DepartmentMapper;
import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public ResultVo add(Department department) {

        departmentMapper.insertSelective(department);

        return ResultUtil.exec(true,"ok",null);
    }

    @Override
    public ResultVo findAllEmp() {
        List<Department> list = departmentMapper.selectAll();
        return ResultUtil.exec(true,"OK",list);
    }
    @Override
    public ResultVo deleteById(Integer id) {
        departmentMapper.deleteById(id);
        return  ResultUtil.exec(true,"OK",null);
    }

    @Override
    public ResultVo updateById(Department department) {
         departmentMapper.updateByPrimaryKeySelective(department);

        return  ResultUtil.exec(true,"OK",null);
    }

    @Override
    public ResultVo searchById(Integer id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        return  ResultUtil.exec(true,"OK",department);
    }
}
