package com.hospital.provide;

import com.hospital.interfaces.TestHello;
import org.springframework.stereotype.Service;

@Service
public class testProvide implements TestHello {
    @Override
//kouchenyu

    public String Say(String str) {
        return "hi   hello project -----"+ str;
    }
}
