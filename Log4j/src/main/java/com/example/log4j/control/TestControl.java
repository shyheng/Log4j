package com.example.log4j.control;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/shy")
    public String string(){
        User user = userMapper.selectByPrimaryKey(1);
        return user.getName();
    }
}
