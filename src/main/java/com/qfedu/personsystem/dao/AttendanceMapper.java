package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.common.vo.AttendanceVo;
import com.qfedu.personsystem.entity.Attendance;


import java.util.List;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer aid);


    int insert(Attendance record);

    //动态添加
    int insertSelective(Attendance record);


    Attendance selectById(Integer aid);

    //动态更新
    int updateById(Attendance record);

    int updateByPrimaryKey(Attendance record);

    //展示所有出勤信息
    List<AttendanceVo> selectAll();




}