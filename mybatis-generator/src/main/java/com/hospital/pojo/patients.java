package com.hospital.pojo;

public class patients {
    private String patientIdentity;

    private String patientName;

    private String patientSex;

    private String patientEmpid;

    public patients(String patientIdentity, String patientName, String patientSex, String patientEmpid) {
        this.patientIdentity = patientIdentity;
        this.patientName = patientName;
        this.patientSex = patientSex;
        this.patientEmpid = patientEmpid;
    }

    public patients() {
        super();
    }

    public String getPatientIdentity() {
        return patientIdentity;
    }

    public void setPatientIdentity(String patientIdentity) {
        this.patientIdentity = patientIdentity == null ? null : patientIdentity.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public String getPatientEmpid() {
        return patientEmpid;
    }

    public void setPatientEmpid(String patientEmpid) {
        this.patientEmpid = patientEmpid == null ? null : patientEmpid.trim();
    }
}