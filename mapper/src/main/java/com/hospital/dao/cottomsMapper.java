package com.hospital.dao;

import com.hospital.pojo.cottoms;

public interface cottomsMapper {
    int deleteByPrimaryKey(String cottomsId);

    int insert(cottoms record);

    int insertSelective(cottoms record);

    cottoms selectByPrimaryKey(String cottomsId);

    int updateByPrimaryKeySelective(cottoms record);

    int updateByPrimaryKeyWithBLOBs(cottoms record);

    int updateByPrimaryKey(cottoms record);
}