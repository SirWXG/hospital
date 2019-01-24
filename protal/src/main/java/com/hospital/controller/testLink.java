package com.hospital.controller;

import com.hospital.interfaces.TestHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testLink {
    @Autowired
    private TestHello hello;
    @RequestMapping("/test")
    public String testHello(@RequestParam(name = "say",defaultValue = "zhangsan")String name){
        return hello.Say(name);
    }
}
