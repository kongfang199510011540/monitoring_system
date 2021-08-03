package com.sys.monitoring_system.service.se;

import com.sys.monitoring_system.entity.user;
import com.sys.monitoring_system.mapper.userMapper;
import com.sys.monitoring_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserImpl implements UserService {

    @Autowired
    private userMapper userMapper;

    @Override
    public int insertUser(){
        user user=new user();
        user.setUsername("小崔");
        user.setPassword("1999");
       return userMapper.insert(user);


    }
}
