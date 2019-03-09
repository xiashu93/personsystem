package com.qfedu.personsystem.entity;

public class Department {
    private Integer did;

    private String dname;

    private String deptinfo;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDeptinfo() {
        return deptinfo;
    }

    public void setDeptinfo(String deptinfo) {
        this.deptinfo = deptinfo == null ? null : deptinfo.trim();
    }
}