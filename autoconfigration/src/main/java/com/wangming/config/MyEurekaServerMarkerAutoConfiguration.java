package com.wangming.config;

import com.wangming.annotation.MyEnableEurekaServer;
import com.wangming.condition.MyConditionOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 模拟EurekaServerMarkerConfiguration
 */
@Configuration
@MyEnableEurekaServer
@MyConditionOnProperty(prefix = "pass")
public class MyEurekaServerMarkerAutoConfiguration {

}
