package com.ksmartech.groupware.service;

import com.ksmartech.groupware.mapper.VacationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    VacationMapper vacationMapper;

}
