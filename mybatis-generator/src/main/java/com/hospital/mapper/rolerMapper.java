package com.hospital.mapper;

import com.hospital.pojo.roler;

public interface rolerMapper {
    int deleteByPrimaryKey(Integer rolerId);

    int insert(roler record);

    int insertSelective(roler record);

    roler selectByPrimaryKey(Integer rolerId);

    int updateByPrimaryKeySelective(roler record);

    int updateByPrimaryKey(roler record);
}