package com.shengpu.ribbonserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello(){
       return restTemplate.getForObject("http://hello-sever/hello",String.class);
    }
}
