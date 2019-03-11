package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;





    @RequestMapping("add.do")
    public ResultVo insert(Department department){

        return departmentService.add(department);
    }


}
