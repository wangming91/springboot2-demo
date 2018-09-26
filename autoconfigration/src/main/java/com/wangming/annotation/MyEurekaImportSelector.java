package com.wangming.annotation;

import com.wangming.config.MyEurekaServerMarkerConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyEurekaImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                MyEurekaServerMarkerConfiguration.class.getName()};
    }
}
