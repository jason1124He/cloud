package com.shengpu.feignserver.feign;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 远程调用主体，value制定调用哪个服务的接口,兼容了ribbon的轮询功能
 */
@FeignClient(value = "hello-sever")
public interface FeignService {
    @RequestMapping("/hello")
    String hello();
}
