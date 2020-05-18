package com.huanyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

    @GetMapping("/hello")
    public Object hello() {
        return "Hello !";
    }
}
