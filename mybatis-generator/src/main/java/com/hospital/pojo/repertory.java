package com.hospital.pojo;

public class repertory {
    private String repertoryId;

    private String midicineId;

    private Integer midicineNum;

    public repertory(String repertoryId, String midicineId, Integer midicineNum) {
        this.repertoryId = repertoryId;
        this.midicineId = midicineId;
        this.midicineNum = midicineNum;
    }

    public repertory() {
        super();
    }

    public String getRepertoryId() {
        return repertoryId;
    }

    public void setRepertoryId(String repertoryId) {
        this.repertoryId = repertoryId == null ? null : repertoryId.trim();
    }

    public String getMidicineId() {
        return midicineId;
    }

    public void setMidicineId(String midicineId) {
        this.midicineId = midicineId == null ? null : midicineId.trim();
    }

    public Integer getMidicineNum() {
        return midicineNum;
    }

    public void setMidicineNum(Integer midicineNum) {
        this.midicineNum = midicineNum;
    }
}