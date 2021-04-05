package com.ksmartech.groupware.controller;

import com.ksmartech.groupware.model.TestDto;
import com.ksmartech.groupware.service.TestService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TestService testService;

    // example
    @GetMapping(value = "/")
    @ResponseBody
    public String hello(){
        return "hello TestController";
    }

    @GetMapping(value = "/name")
    @ResponseBody
    public String hello2(){
        return testService.nameHello("yujuhyeon");
    }


    @GetMapping(value = "/name/{name}")
    @ResponseBody
    public String hello3(@PathVariable String name){
        return testService.nameHello(name);
    }

    // get db data example
    @GetMapping(value = "/employee/{number}")
    @ResponseBody
    public TestDto empInfo(@PathVariable String number){

        logger.debug(number);

        TestDto result = testService.showEmpInfo(number);
        return result;
    }

}
