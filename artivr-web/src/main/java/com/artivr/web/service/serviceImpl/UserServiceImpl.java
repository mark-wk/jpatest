package com.artivr.web.service.serviceImpl;

import com.artivr.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.cache.annotation.CacheResult;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @CacheResult(cacheName = "usid" )
    public Integer getUserName(int id) {
        System.out.println("hello");
        return jdbcTemplate.queryForObject("select count(1) from tb_sys_user",Integer.class);
    }
}
