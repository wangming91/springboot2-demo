package com.wangming.bootstrap;

import com.wangming.condition.MyConditionOnProperty;
import com.wangming.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyOnConditionPropertyBootstrap {

    @Bean(name = "hi")
    @MyConditionOnProperty(prefix = "pass")
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(MyOnConditionPropertyBootstrap.class)
                        .web(WebApplicationType.NONE)
                        .run(args);

        String bean = context.getBean("hi", String.class);

        // 关闭上下文
        context.close();

    }
}
