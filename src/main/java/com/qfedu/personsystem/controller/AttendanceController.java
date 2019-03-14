package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    //展示所有出勤数据
    @RequestMapping("attList.do")
    public ResultVo findAll() {
        return attendanceService.findAllAtt();
    }

    //根据id删除
    @RequestMapping("attDelete.do")
    public ResultVo deleteById(Integer aid){
        return attendanceService.delete(aid);
    }

    //根据id查找
    @RequestMapping("attFind.do")
    public ResultVo findById(Integer aid){
        return  attendanceService.find(aid);
    }

}
