package com.huanyu.controller;

import com.huanyu.pojo.Users;
import com.huanyu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class HelloCotroller {


    @Autowired
    UsersService service;

    @RequestMapping(value = "/user/save",method = RequestMethod.POST)
    public void saveUser(@RequestBody Users users) throws Exception {
//        users.setCreatedTime(new Date());
//        users.setUpdatedTime(new Date());
//        service.save(users);
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
