package com.ksmartech.groupware.controller;

import com.ksmartech.groupware.model.GroupDto;
import com.ksmartech.groupware.model.ResponseModel;
import com.ksmartech.groupware.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GroupController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GroupService groupService;

    //조직 목록 조회
    @GetMapping(value = "/group")
    @ResponseBody
    public List<GroupDto> groupList(){

        List<GroupDto> result = groupService.findGroup(); ;

        return result;
    }

    //조직 추가
    @PostMapping(value = "/group")
    @ResponseBody
    public ResponseModel groupAdd(@RequestBody GroupDto groupDto){

        ResponseModel result = groupService.addGroup(groupDto);

        return result;
    }

    //조직 삭제
    @DeleteMapping(value = "/group/{groupId}")
    @ResponseBody
    public ResponseModel groupRemove(@PathVariable String groupId){

        ResponseModel result = groupService.removeGroup(groupId);

        return result;
    }

}
