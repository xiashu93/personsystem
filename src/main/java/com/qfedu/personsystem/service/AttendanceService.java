package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Attendance;

public interface AttendanceService {

//展示所有考勤数据
    ResultVo findAllAtt();


    //动态添加
    ResultVo save(Attendance attendance);

    //动态修改考勤数据
    ResultVo updateById(Attendance attendance);


    //删除考勤
    ResultVo delete(Integer id);

    //查找考勤
    ResultVo find(Integer aid);


}
