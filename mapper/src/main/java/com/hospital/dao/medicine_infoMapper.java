package com.hospital.dao;

import com.hospital.pojo.medicine_info;

public interface medicine_infoMapper {
    int deleteByPrimaryKey(String medicineInfoId);

    int insert(medicine_info record);

    int insertSelective(medicine_info record);

    medicine_info selectByPrimaryKey(String medicineInfoId);

    int updateByPrimaryKeySelective(medicine_info record);

    int updateByPrimaryKey(medicine_info record);
}