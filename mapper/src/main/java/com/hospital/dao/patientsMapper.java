package com.hospital.dao;

import com.hospital.pojo.patients;

public interface patientsMapper {
    int deleteByPrimaryKey(String patientIdentity);

    int insert(patients record);

    int insertSelective(patients record);

    patients selectByPrimaryKey(String patientIdentity);

    int updateByPrimaryKeySelective(patients record);

    int updateByPrimaryKey(patients record);
}