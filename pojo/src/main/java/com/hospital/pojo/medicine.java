package com.hospital.pojo;

import java.util.Date;

public class medicine {
    private String medicineId;

    private String name;

    private String usefor;

    private Float price;

    private String guige;

    private String howToUse;

    private String company;

    private Date createDate;

    private String deadDate;

    private String remark;

    private String img;

    public medicine(String medicineId, String name, String usefor, Float price, String guige, String howToUse, String company, Date createDate, String deadDate, String remark, String img) {
        this.medicineId = medicineId;
        this.name = name;
        this.usefor = usefor;
        this.price = price;
        this.guige = guige;
        this.howToUse = howToUse;
        this.company = company;
        this.createDate = createDate;
        this.deadDate = deadDate;
        this.remark = remark;
        this.img = img;
    }

    public medicine() {
        super();
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId == null ? null : medicineId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsefor() {
        return usefor;
    }

    public void setUsefor(String usefor) {
        this.usefor = usefor == null ? null : usefor.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getGuige() {
        return guige;
    }

    public void setGuige(String guige) {
        this.guige = guige == null ? null : guige.trim();
    }

    public String getHowToUse() {
        return howToUse;
    }

    public void setHowToUse(String howToUse) {
        this.howToUse = howToUse == null ? null : howToUse.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(String deadDate) {
        this.deadDate = deadDate == null ? null : deadDate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}