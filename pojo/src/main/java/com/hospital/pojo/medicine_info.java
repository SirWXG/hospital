package com.hospital.pojo;

public class medicine_info {
    private String medicineInfoId;

    private String medicineId;

    private Integer medicineNum;

    private String medicineOrderId;

    private String medicineDosage;

    public medicine_info(String medicineInfoId, String medicineId, Integer medicineNum, String medicineOrderId, String medicineDosage) {
        this.medicineInfoId = medicineInfoId;
        this.medicineId = medicineId;
        this.medicineNum = medicineNum;
        this.medicineOrderId = medicineOrderId;
        this.medicineDosage = medicineDosage;
    }

    public medicine_info() {
        super();
    }

    public String getMedicineInfoId() {
        return medicineInfoId;
    }

    public void setMedicineInfoId(String medicineInfoId) {
        this.medicineInfoId = medicineInfoId == null ? null : medicineInfoId.trim();
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId == null ? null : medicineId.trim();
    }

    public Integer getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(Integer medicineNum) {
        this.medicineNum = medicineNum;
    }

    public String getMedicineOrderId() {
        return medicineOrderId;
    }

    public void setMedicineOrderId(String medicineOrderId) {
        this.medicineOrderId = medicineOrderId == null ? null : medicineOrderId.trim();
    }

    public String getMedicineDosage() {
        return medicineDosage;
    }

    public void setMedicineDosage(String medicineDosage) {
        this.medicineDosage = medicineDosage == null ? null : medicineDosage.trim();
    }
}