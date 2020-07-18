package com.mu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping("/sayhello")
    public String sayHello(){
        return "hello world!" ;
    }
}
