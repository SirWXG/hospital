package com.hospital.pojo;

public class medicine_order {
    private String medicineOrderId;

    private String cottomsId;

    public medicine_order(String medicineOrderId, String cottomsId) {
        this.medicineOrderId = medicineOrderId;
        this.cottomsId = cottomsId;
    }

    public medicine_order() {
        super();
    }

    public String getMedicineOrderId() {
        return medicineOrderId;
    }

    public void setMedicineOrderId(String medicineOrderId) {
        this.medicineOrderId = medicineOrderId == null ? null : medicineOrderId.trim();
    }

    public String getCottomsId() {
        return cottomsId;
    }

    public void setCottomsId(String cottomsId) {
        this.cottomsId = cottomsId == null ? null : cottomsId.trim();
    }
}