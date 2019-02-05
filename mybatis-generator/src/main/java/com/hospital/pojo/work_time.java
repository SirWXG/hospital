package com.hospital.pojo;

public class work_time {
    private Integer id;

    private String startTime;

    private String endTime;

    private String empId;

    private String remark;

    public work_time(Integer id, String startTime, String endTime, String empId, String remark) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.empId = empId;
        this.remark = remark;
    }

    public work_time() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}