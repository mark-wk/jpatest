package com.artivr.web.service.serviceImpl;

import com.artivr.entity.base.TbSysUserEntity;
import com.artivr.repository.base.UserRepository;
import com.artivr.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

//    @CacheResult(cacheName = "usid" )
    public TbSysUserEntity getUserById(long id) {
        return userRepository.findById(id);
    }
}
