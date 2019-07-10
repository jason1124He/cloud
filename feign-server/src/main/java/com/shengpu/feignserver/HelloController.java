package com.shengpu.feignserver;


import com.shengpu.feignserver.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/hello")
    public  String hello(){
        return feignService.hello();
    }
}
