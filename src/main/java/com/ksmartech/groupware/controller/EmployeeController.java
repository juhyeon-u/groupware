package com.ksmartech.groupware.controller;

import com.ksmartech.groupware.model.EmployeeDto;
import com.ksmartech.groupware.model.ResponseModel;
import com.ksmartech.groupware.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    EmployeeService employeeService;

    //신규 사원 추가
    @PostMapping(value = "/employee-info")
    @ResponseBody
    public ResponseModel employeeAdd(@RequestBody EmployeeDto employeeDto){

        ResponseModel result = employeeService.addEmployee(employeeDto);

        return result;

    }
}
