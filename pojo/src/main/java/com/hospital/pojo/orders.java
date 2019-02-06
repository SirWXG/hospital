package com.hospital.pojo;

import java.util.Date;

public class orders {
    private String orsderId;

    private String orderName;

    private String patientAge;

    private String orderPhone;

    private Integer orderDeptid;

    private String empId;

    private String orderInfo;

    private Date orderDate;

    private Integer orderStatus;

    public orders(String orsderId, String orderName, String patientAge, String orderPhone, Integer orderDeptid, String empId, String orderInfo, Date orderDate, Integer orderStatus) {
        this.orsderId = orsderId;
        this.orderName = orderName;
        this.patientAge = patientAge;
        this.orderPhone = orderPhone;
        this.orderDeptid = orderDeptid;
        this.empId = empId;
        this.orderInfo = orderInfo;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
    }

    public orders() {
        super();
    }

    public String getOrsderId() {
        return orsderId;
    }

    public void setOrsderId(String orsderId) {
        this.orsderId = orsderId == null ? null : orsderId.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge == null ? null : patientAge.trim();
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    public Integer getOrderDeptid() {
        return orderDeptid;
    }

    public void setOrderDeptid(Integer orderDeptid) {
        this.orderDeptid = orderDeptid;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo == null ? null : orderInfo.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}