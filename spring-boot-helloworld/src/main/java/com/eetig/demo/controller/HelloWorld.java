package com.eetig.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return "hello "+str;
    }


    /**
     * @Date 2021/6/11 16:08
     * @Author eetig
     * @Description springboot热启动测试
     * @param str
     * @Return java.lang.String
     **/
    @RequestMapping("/devtool")
    public String hotStartTest(@RequestParam(name = "start" ,defaultValue = "go1hgjkhgkjgh11111")String str){
        return "go11111222222"+str;
    }

}
