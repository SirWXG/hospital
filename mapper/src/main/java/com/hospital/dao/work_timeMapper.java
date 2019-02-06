package com.hospital.dao;

import com.hospital.pojo.work_time;

public interface work_timeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(work_time record);

    int insertSelective(work_time record);

    work_time selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(work_time record);

    int updateByPrimaryKey(work_time record);
}