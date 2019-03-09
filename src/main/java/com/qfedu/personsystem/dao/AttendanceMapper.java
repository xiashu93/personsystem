package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.Attendance;
import com.qfedu.personsystem.entity.User;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);
    int lsl();

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    User selectName(String name);
}