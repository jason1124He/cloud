package com.shengpu.feignserver2.feign;


import com.shengpu.feignserver2.feign.config.FeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-server",fallback = FeignFallback.class)
public interface FeignConsumer{

    @RequestMapping("/hello")
    String hello();
}
