package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.common.vo.AttendanceVo;
import com.qfedu.personsystem.entity.Attendance;


import java.util.List;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);


    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    //展示所有出勤信息
    List<AttendanceVo> selectAll();
}