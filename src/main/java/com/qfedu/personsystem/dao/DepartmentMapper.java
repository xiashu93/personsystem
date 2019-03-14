package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.Department;
import com.qfedu.personsystem.entity.Employee;
import com.qfedu.personsystem.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {


    int deleteByPrimaryKey(Integer did);


    int insert(Department record);

    //添加部门
    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> selectAll();

    //删除方法
    int deleteById(Integer id);





  /*  //    查找所有部门
    @Select("select did,dname,deptinfo from t_department order by did desc limit #{index},#{count}")
    @ResultType(Department.class)
    List<Department> queryByPage(@Param("index") int index, @Param("count") int count);

    //查询数量
    @Select("select Count(*) from t_department")
    @ResultType(long.class)
    long queryCount();*/

}