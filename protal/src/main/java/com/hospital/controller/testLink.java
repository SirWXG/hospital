package com.hospital.controller;

import com.hospital.interfaces.DeptService;
import com.hospital.interfaces.TestHello;
import com.hospital.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testLink {
    @Autowired
    private TestHello hello;

    @Autowired
    private DeptService deptService;

    @RequestMapping("/test")
    public String testHello(@RequestParam(name = "say",defaultValue = "zhangsan")String name){
        return hello.Say(name);
    }

    @RequestMapping(value = "/selectAllDept",method = RequestMethod.GET)
    public String getAllDept(Model model){
        List<dept> list = deptService.selectAllDept();
        System.out.println(list);
        return "orderInfo";
    }

}
