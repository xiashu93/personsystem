package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.entity.Employee;
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
    @RequestMapping("depList.do")
    public ResultVo findAll() {
        return departmentService.findAllEmp();
    }

    //删除方法
    @RequestMapping("depDelete.do")
    public ResultVo delete(int id) {
        return departmentService.deleteById(id);
    }

    @RequestMapping("depUpdate.do")
    public ResultVo update(Department department) {
        return departmentService.updateById(department);
    }

    @RequestMapping("searchById.do")
    public ResultVo search(Integer id){
        return  departmentService.searchById(id);
    }


}
