package com.qsqx.controller;

import com.qsqx.mapper.UserMapper;
import com.qsqx.pojo.User;
import com.qsqx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public User test(){
        return userService.select(1L);
    }

}
