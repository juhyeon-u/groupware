package com.ksmartech.groupware.service;

import com.ksmartech.groupware.mapper.GroupMapper;
import com.ksmartech.groupware.model.GroupDto;
import com.ksmartech.groupware.model.ResponseModel;
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

    //조직 추가
    public ResponseModel addGroup(GroupDto groupDto){

        int result = groupMapper.insertGroup(groupDto);

        ResponseModel responseModel = new ResponseModel();

        if(result == 1) {
            responseModel.setCode("0000");
            responseModel.setMessage("Success");
        } else {
            responseModel.setCode("0001");
            responseModel.setMessage("Fail to add new group");
        }

        logger.debug(responseModel.toString());

        return responseModel;
    }

    //조직 삭제
    public ResponseModel removeGroup(String groupId){

        int result = groupMapper.deleteGroup(groupId);

        ResponseModel responseModel = new ResponseModel();

        if(result == 1) {
            responseModel.setCode("0000");
            responseModel.setMessage("Success");
        } else {
            responseModel.setCode("0001");
            responseModel.setMessage("Fail to delete group");
        }

        logger.debug(responseModel.toString());

        return responseModel;
    }

}
