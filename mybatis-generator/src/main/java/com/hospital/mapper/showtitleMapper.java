package com.hospital.mapper;

import com.hospital.pojo.showtitle;

public interface showtitleMapper {
    int deleteByPrimaryKey(String titleId);

    int insert(showtitle record);

    int insertSelective(showtitle record);

    showtitle selectByPrimaryKey(String titleId);

    int updateByPrimaryKeySelective(showtitle record);

    int updateByPrimaryKeyWithBLOBs(showtitle record);

    int updateByPrimaryKey(showtitle record);
}