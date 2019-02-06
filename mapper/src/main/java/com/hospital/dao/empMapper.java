package com.hospital.dao;

import com.hospital.pojo.emp;

public interface empMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(emp record);

    int insertSelective(emp record);

    emp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}