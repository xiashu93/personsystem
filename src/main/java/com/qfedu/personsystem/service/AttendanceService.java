package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.ResultVo;

public interface AttendanceService {

//展示所有考勤数据
    ResultVo findAllAtt();


    //删除考勤
    ResultVo delete(Integer id);

    //查找考勤
    ResultVo find(Integer aid);

}
