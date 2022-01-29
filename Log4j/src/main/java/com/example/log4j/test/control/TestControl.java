//package com.example.log4j.test.control;
//
//import com.example.log4j.test.mapper.UserMapper;
//import com.example.log4j.test.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class TestControl {
//
//    @Autowired
//    UserMapper userMapper;
//
//
//    @RequestMapping("/shy")
//    public String string(){
//        List<User> users = userMapper.selectList(null);
//        return users.get(0).getName();
//    }
//}
