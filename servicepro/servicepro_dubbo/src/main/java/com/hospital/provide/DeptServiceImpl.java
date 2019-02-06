package com.hospital.provide;

import com.hospital.dao.deptMapper;
import com.hospital.interfaces.DeptService;
import com.hospital.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private deptMapper deptMapper;

    @Override
    public List<dept> selectAllDept() {
        List<dept> list = deptMapper.selectAllDept();
        return list;
    }
}
