package com.hospital.dao;

import com.hospital.pojo.orders;

public interface ordersMapper {
    int deleteByPrimaryKey(String orsderId);

    int insert(orders record);

    int insertSelective(orders record);

    orders selectByPrimaryKey(String orsderId);

    int updateByPrimaryKeySelective(orders record);

    int updateByPrimaryKey(orders record);
}