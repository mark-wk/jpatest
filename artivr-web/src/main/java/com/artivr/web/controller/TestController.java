package com.artivr.web.controller;

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
    @GetMapping(value = "/getUsersCount")
    public void getUserCount(){
        int a = userService.getUserName(123456789);
    }
}
