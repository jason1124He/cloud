package com.shengpu.feignserver2.feign.config;

import com.shengpu.feignserver2.feign.FeignConsumer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * fallback 服务降级处理，当远程服务调用失败时，会走这里
 * 还有一张fallbackFactory处理方式，二选一即可，
 * 通常是用来排查出错的原因
 */
@Component
public class FeignFallback implements FeignConsumer {
    private final static Logger logger = Logger.getLogger(FeignFallback.class);

    @Override
    public String hello() {
        logger.warn("hello的服务远程调用失败");
        return "调用失败";
    }
}
