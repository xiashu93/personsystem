package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}