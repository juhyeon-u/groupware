package com.ksmartech.groupware.mapper;

import com.ksmartech.groupware.model.TestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestDto showEmpInfo(String number);

}
