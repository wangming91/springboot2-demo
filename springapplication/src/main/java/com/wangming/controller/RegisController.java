package com.wangming.controller;

import com.wangming.event.MyRegisApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisController {

    @Autowired
    ApplicationContext context;

    @GetMapping("/hello")
    public String regis() {
        //....
        System.out.println("RegisController:"+Thread.currentThread().getId()+":"+Thread.currentThread().getName());

        context.publishEvent(new MyRegisApplicationEvent("注冊成功"));
        return "ok";
    }
}
