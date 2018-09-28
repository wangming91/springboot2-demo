package com.wangming.event;

import org.springframework.context.ApplicationEvent;

public class MyRegisApplicationEvent extends ApplicationEvent {

    public MyRegisApplicationEvent(Object source) {
        super(source);
    }
}
