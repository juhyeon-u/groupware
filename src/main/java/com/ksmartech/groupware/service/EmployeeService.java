package com.ksmartech.groupware.service;

import com.ksmartech.groupware.mapper.EmployeeMapper;
import com.ksmartech.groupware.model.EmployeeDto;
import com.ksmartech.groupware.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeMapper employeeMapper;


    //사원 추가
    public ResponseModel addEmployee(EmployeeDto employeeDto){

        int result = employeeMapper.insertEmployee(employeeDto);

        ResponseModel responseModel = new ResponseModel();

        if(result == 1) {
            responseModel.setCode("0000");
            responseModel.setMessage("Success");
        } else {
            responseModel.setCode("0001");
            responseModel.setMessage("Fail");
        }

        logger.debug(responseModel.toString());

        return responseModel;
    }


    //개인 사원 정보 조회
    public EmployeeDto findEmployee(String employeeId){

        EmployeeDto result = employeeMapper.selectEmployee(employeeId);

        return result;
    }

    //팀원 인사카드 조회
    public List<EmployeeDto> findGroupEmployee(String groupId){

        List<EmployeeDto> result = employeeMapper.selectGroupEmployee(groupId);

        return result;
    }

    //전사원 인사정보 조회
    public  List<EmployeeDto> findAllEmployee(){

        List<EmployeeDto> result= employeeMapper.selectAllEmployee();

        return result;
    }

}