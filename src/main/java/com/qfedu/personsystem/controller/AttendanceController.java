package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.vo.ResultVo;
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
}
