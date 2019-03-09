package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.Attendance;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);
    int lsl();

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}