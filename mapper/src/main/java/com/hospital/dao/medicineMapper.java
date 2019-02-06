package com.hospital.dao;

import com.hospital.pojo.medicine;

public interface medicineMapper {
    int insert(medicine record);

    int insertSelective(medicine record);
}