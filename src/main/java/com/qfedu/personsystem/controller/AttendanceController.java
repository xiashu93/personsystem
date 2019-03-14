package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.Attendance;
import com.qfedu.personsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    //展示所有出勤数据
    @RequestMapping("attList.do")
    public ResultVo findAll() {
        return attendanceService.findAllAtt();
    }

    //添加
    @RequestMapping("attAdd.do")
    public ResultVo save(Attendance attendance) {
        return attendanceService.save(attendance);
    }

    //动态修改
    @RequestMapping("attUpdate.do")
    public ResultVo update(Attendance attendance) {
        return attendanceService.updateById(attendance);
    }
}
