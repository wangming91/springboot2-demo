package com.wangming.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional({MyOnConditionProperty.class})
public @interface MyConditionOnProperty {

    String prefix() default "";

}
