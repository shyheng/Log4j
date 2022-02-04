package com.example.log4j.mysql.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.log4j.mysql.entity.User;
import com.example.log4j.mysql.mapper.UserMapper;
import com.example.log4j.mysql.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shyheng
 * @since 2022-01-28
 */
@Service
@Component
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

}
