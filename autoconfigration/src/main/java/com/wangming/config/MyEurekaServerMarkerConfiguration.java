package com.wangming.config;

import org.springframework.context.annotation.Bean;

/**
 * 模拟EurekaServerMarkerConfiguration
 */
public class MyEurekaServerMarkerConfiguration {
    @Bean
    public String hello() { // 方法名即 Bean 名称
        return "Hello,2018";
    }
}
