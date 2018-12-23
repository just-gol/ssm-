package com.qsqx.service.impl;

import com.qsqx.mapper.UserMapper;
import com.qsqx.pojo.User;
import com.qsqx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User select(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
