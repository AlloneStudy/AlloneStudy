package io.swagger.service;

import io.swagger.db.UserMapper;
import io.swagger.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(String username){
        User user=userMapper.findUserInfo(username);
        return user;
    }

}