package com.huanyu.service.impl;

import com.huanyu.mapper.UsersMapper;
import com.huanyu.pojo.Users;
import com.huanyu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;



@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public boolean queryUsernameIsExist(String userName) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userName","username");
        Users users = usersMapper.selectOneByExample(example);
        return users == null ? false : true;
    }

}
