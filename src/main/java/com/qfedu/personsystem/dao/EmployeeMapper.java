package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    //删除方法
    int deleteById(Integer eid);

    int insert(Employee record);

    //动态添加方法
    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    //查询当前页的所有员工信息
    List<Employee> queryByPage(@Param("index") int index, @Param("count") int count);

    //查询一共有多少条数据
    long queryCount();
}