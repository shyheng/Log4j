package com.example.log4j.mysql.mapper;

import com.example.log4j.mysql.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shyheng
 * @since 2022-01-28
 */

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
