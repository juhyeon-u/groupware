package com.ksmartech.groupware.service;

import com.ksmartech.groupware.mapper.GroupMapper;
import com.ksmartech.groupware.model.GroupDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GroupMapper groupMapper;

    //조직 목록 조회
    public List<GroupDto> findGroup(){

        List<GroupDto> result = groupMapper.selectGroup();

        return result;
    }

}
