package com.huanyu.service;


import com.huanyu.pojo.Users;

import java.util.List;

public interface UsersService {

    /**
     * 判断用户名是否存在
     * @param userName  用户名
     * @return
     */
    boolean queryUsernameIsExist(String userName);


}
