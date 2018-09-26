package com.wangming.annotation;


import com.wangming.config.MyEurekaServerMarkerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 *  模拟激活 eurekaserver模块
 *
 * @author 王明
 * @since 2018/9/25
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(MyEurekaServerMarkerConfiguration.class)
@Import(MyEurekaImportSelector.class)
public @interface MyEnableEurekaServer {
}
