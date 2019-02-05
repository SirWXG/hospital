package com.hospital.pojo;

public class roler {
    private Integer rolerId;

    private String rolerName;

    public roler(Integer rolerId, String rolerName) {
        this.rolerId = rolerId;
        this.rolerName = rolerName;
    }

    public roler() {
        super();
    }

    public Integer getRolerId() {
        return rolerId;
    }

    public void setRolerId(Integer rolerId) {
        this.rolerId = rolerId;
    }

    public String getRolerName() {
        return rolerName;
    }

    public void setRolerName(String rolerName) {
        this.rolerName = rolerName == null ? null : rolerName.trim();
    }
}