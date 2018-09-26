package com.wangming.bootstrap;

import com.wangming.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.wangming.service")
public class CalculateBootstrap {


    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(CalculateBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService bean = context.getBean(CalculateService.class);
        int calculate = bean.calculate(1, 2, 3);
        // 关闭上下文
        context.close();

    }
}
