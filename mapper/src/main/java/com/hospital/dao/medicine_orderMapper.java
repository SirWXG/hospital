package com.hospital.dao;

import com.hospital.pojo.medicine_order;

public interface medicine_orderMapper {
    int deleteByPrimaryKey(String medicineOrderId);

    int insert(medicine_order record);

    int insertSelective(medicine_order record);

    medicine_order selectByPrimaryKey(String medicineOrderId);

    int updateByPrimaryKeySelective(medicine_order record);

    int updateByPrimaryKey(medicine_order record);
}