package com.ksmartech.groupware.service;

import com.ksmartech.groupware.mapper.TestMapper;
import com.ksmartech.groupware.model.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestMapper testMapper;

    public String nameHello(String name){
        return name + "hello";
    }

    public TestDto showEmpInfo(String number){
        TestDto result = testMapper.showEmpInfo(number);
        return result;
    }

}
