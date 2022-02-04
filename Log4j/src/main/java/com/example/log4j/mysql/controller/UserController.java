package com.example.log4j.mysql.controller;


import com.example.log4j.mysql.entity.User;
import com.example.log4j.mysql.mapper.UserMapper;
import com.example.log4j.mysql.service.IUserService;
import com.example.log4j.mysql.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shyheng
 * @since 2022-01-28
 */
@RestController
@RequestMapping("/mysql/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/shy")
    public List<User> shy(){

        return userService.list();
    }
}

