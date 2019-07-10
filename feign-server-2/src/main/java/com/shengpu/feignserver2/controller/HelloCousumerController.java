package com.shengpu.feignserver2.controller;

import com.shengpu.feignserver2.feign.FeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCousumerController {
    @Autowired
    private FeignConsumer feignConsumer;

    @RequestMapping("/hello")
    public  String helloConsumer(){
        return feignConsumer.hello();
    }
}
