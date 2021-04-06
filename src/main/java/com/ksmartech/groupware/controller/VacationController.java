package com.ksmartech.groupware.controller;

import com.ksmartech.groupware.service.VacationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VacationController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    VacationService vacationService;



}
