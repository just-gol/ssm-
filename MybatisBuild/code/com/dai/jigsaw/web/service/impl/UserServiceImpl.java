package com.dai.jigsaw.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.account.gms.core.generic.GenericDao;
import com.account.gms.core.generic.GenericServiceImpl;
import com.dai.jigsaw.web.dao.UserMapper;
import com.dai.jigsaw.web.model.User;
import com.dai.jigsaw.web.service.UserService;

@Service("USER_SERVICE")
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper mapper;


    @Override
    public GenericDao<User, Long> getDao() {
        return mapper;
    }
}
