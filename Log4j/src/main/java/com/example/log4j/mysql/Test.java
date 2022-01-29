package com.example.log4j.mysql;

import com.example.log4j.mysql.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class Test {

    @Resource
    UserMapper userMapper;

    public static void main(String[] args) {
        System.out.println(new Test().userMapper.selectList(null).get(0).getName());
    }
}
