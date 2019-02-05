package com.hospital.mapper;

import com.hospital.pojo.dept;

public interface deptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dept record);

    int insertSelective(dept record);

    dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dept record);

    int updateByPrimaryKey(dept record);
}