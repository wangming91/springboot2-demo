package com.wangming.bootstrap;

import com.wangming.annotation.MyEnableEurekaServer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@MyEnableEurekaServer
public class MyEurekaServerBootstrap {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = new SpringApplicationBuilder(MyEurekaServerBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        String hello = context.getBean("hello", String.class);

        System.out.println("hello Bean : " + hello);

        // 关闭上下文
        context.close();

    }

}
