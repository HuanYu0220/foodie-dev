package com.huanyu.mapper;

import com.huanyu.my.MyMapper;
import com.huanyu.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component("UsersMapper")
public interface UsersMapper extends MyMapper<Users> {
}