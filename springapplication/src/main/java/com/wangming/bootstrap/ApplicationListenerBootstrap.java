package com.wangming.bootstrap;

import com.wangming.listener.MyRegisApplicationListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.wangming")
@EnableScheduling
@EnableAsync
public class ApplicationListenerBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                new SpringApplicationBuilder(ApplicationListenerBootstrap.class)
//                        .web(WebApplicationType.NONE)
                        .run(args);
//        run.addApplicationListener(event -> {
//            if (event instanceof MyRegisApplicationEvent)
//                System.out.println("MyRegisApplicationEvent:"+event.getSource());
//        });
//        run.addApplicationListener(new MyRegisApplicationListener());
//        run.publishEvent(new MyRegisApplicationEvent("我发的消息"));
//        run.refresh();

//        run.close();
    }

}
