package com.ksmartech.groupware.mapper;

import com.ksmartech.groupware.model.EmployeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    //신규사원 입사
    int insertEmployee(EmployeeDto employeeDto);

    //사원 정보 조회
    EmployeeDto selectEmployee(String employeeId);

    //팀원들 인사 카드 조회
    List<EmployeeDto> selectGroupEmployee(String groupId);

}
