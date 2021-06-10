package com.eetig.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2021/6/10 周四 23:59
 * @Author xu
 * @FileName HelloWorld
 * @Description 入门学习第一课：helloworld 和 test
 */

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello (@RequestParam(name = "name",defaultValue = "world")String str){
        return "hello"+str;
    }

}
