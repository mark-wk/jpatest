package com.artivr.web.controller;

import com.alibaba.fastjson.JSON;
import com.artivr.entity.base.TbSysUserEntity;
import com.artivr.entity.log.TbSysLogsEntity;
import com.artivr.web.service.LogService;
import com.artivr.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;
    @GetMapping(value = "/getLog")
    public TbSysLogsEntity getLog(){
       return logService.getLogById(1);
    }
    @GetMapping(value = "/getUser")
    public TbSysUserEntity getUser(){
        return userService.getUserById(666666);
    }
    @GetMapping(value = "/manyTest")
    public String manyTest(){
        System.out.print(JSON.toJSONString(logService.getLogById(1)));
        System.out.print(JSON.toJSONString(userService.getUserById(666666)));
        return ""+ logService.getLogById(1)+userService.getUserById(666666);
    }
}
