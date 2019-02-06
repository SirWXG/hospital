package com.hospital.pojo;

import java.util.Date;

public class emp {
    private Integer id;

    private String empId;

    private String empName;

    private String empPass;

    private Date hiredate;

    private Integer rolerId;

    private Integer deptId;

    private String empInfo;

    private String empImg;

    private Integer empMaxorder;

    public emp(Integer id, String empId, String empName, String empPass, Date hiredate, Integer rolerId, Integer deptId, String empInfo, String empImg, Integer empMaxorder) {
        this.id = id;
        this.empId = empId;
        this.empName = empName;
        this.empPass = empPass;
        this.hiredate = hiredate;
        this.rolerId = rolerId;
        this.deptId = deptId;
        this.empInfo = empInfo;
        this.empImg = empImg;
        this.empMaxorder = empMaxorder;
    }

    public emp() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPass() {
        return empPass;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass == null ? null : empPass.trim();
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getRolerId() {
        return rolerId;
    }

    public void setRolerId(Integer rolerId) {
        this.rolerId = rolerId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(String empInfo) {
        this.empInfo = empInfo == null ? null : empInfo.trim();
    }

    public String getEmpImg() {
        return empImg;
    }

    public void setEmpImg(String empImg) {
        this.empImg = empImg == null ? null : empImg.trim();
    }

    public Integer getEmpMaxorder() {
        return empMaxorder;
    }

    public void setEmpMaxorder(Integer empMaxorder) {
        this.empMaxorder = empMaxorder;
    }
}