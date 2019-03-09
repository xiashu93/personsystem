package com.qfedu.personsystem.entity;

public class Job {
    private Integer jid;

    private String jname;

    private String jobinfo;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public String getJobinfo() {
        return jobinfo;
    }

    public void setJobinfo(String jobinfo) {
        this.jobinfo = jobinfo == null ? null : jobinfo.trim();
    }
}