package com.qfedu.personsystem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Attendance {
    private Integer aid;

    private Integer empid;

    private Integer attenddays;

    private Integer leavedays;

    private Integer absentdays;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date recorddate;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getAttenddays() {
        return attenddays;
    }

    public void setAttenddays(Integer attenddays) {
        this.attenddays = attenddays;
    }

    public Integer getLeavedays() {
        return leavedays;
    }

    public void setLeavedays(Integer leavedays) {
        this.leavedays = leavedays;
    }

    public Integer getAbsentdays() {
        return absentdays;
    }

    public void setAbsentdays(Integer absentdays) {
        this.absentdays = absentdays;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }
}