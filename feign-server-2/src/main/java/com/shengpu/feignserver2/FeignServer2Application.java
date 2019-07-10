package com.shengpu.feignserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignServer2Application.class, args);
    }

}
