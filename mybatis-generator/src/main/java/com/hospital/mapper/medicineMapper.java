package com.hospital.mapper;

import com.hospital.pojo.medicine;

public interface medicineMapper {
    int insert(medicine record);

    int insertSelective(medicine record);
}