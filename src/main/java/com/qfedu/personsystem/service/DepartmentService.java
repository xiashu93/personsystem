package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.entity.Employee;

public interface DepartmentService {


//    添加部门
    ResultVo add(Department department);

    ResultVo findAllEmp();
    //删除
    ResultVo deleteById(Integer id);
    ResultVo updateById(Department department);

    ResultVo searchById(Integer id);


}
