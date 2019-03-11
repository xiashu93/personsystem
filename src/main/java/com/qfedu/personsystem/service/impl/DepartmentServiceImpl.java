package com.qfedu.personsystem.service.impl;


import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.DepartmentMapper;
import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public ResultVo add(Department department) {

        departmentMapper.insertSelective(department);

        return ResultUtil.exec(true,"ok",null);
    }
}
