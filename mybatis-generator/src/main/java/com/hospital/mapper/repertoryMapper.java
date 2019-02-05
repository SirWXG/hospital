package com.hospital.mapper;

import com.hospital.pojo.repertory;

public interface repertoryMapper {
    int deleteByPrimaryKey(String repertoryId);

    int insert(repertory record);

    int insertSelective(repertory record);

    repertory selectByPrimaryKey(String repertoryId);

    int updateByPrimaryKeySelective(repertory record);

    int updateByPrimaryKey(repertory record);
}