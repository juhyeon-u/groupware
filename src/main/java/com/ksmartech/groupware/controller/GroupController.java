package com.ksmartech.groupware.controller;

import com.ksmartech.groupware.model.GroupDto;
import com.ksmartech.groupware.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
