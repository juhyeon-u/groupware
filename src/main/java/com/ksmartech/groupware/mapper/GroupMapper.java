package com.ksmartech.groupware.mapper;

import com.ksmartech.groupware.model.GroupDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupMapper {

    //조직 목록 조회
    List<GroupDto> selectGroup();

    //조직 추가
    int insertGroup(GroupDto groupDto);

}
