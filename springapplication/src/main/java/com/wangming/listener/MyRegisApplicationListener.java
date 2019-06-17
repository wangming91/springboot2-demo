package com.wangming.listener;

import com.wangming.event.MyRegisApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Component
@Order(Ordered.LOWEST_PRECEDENCE+1)
@Component
@Async
public class MyRegisApplicationListener implements ApplicationListener<MyRegisApplicationEvent> {

    @Override
    public void onApplicationEvent(MyRegisApplicationEvent event) {
        System.out.println("regislistener:"+Thread.currentThread().getId()+":"+Thread.currentThread().getName());
        System.out.println("MyRegisApplicationListener:name:"+event.getClass().getName());
        System.out.println("MyRegisApplicationListener:getSource:"+event.getSource());
        System.out.println("发送短信告知用户注册成功！");

    }
}
