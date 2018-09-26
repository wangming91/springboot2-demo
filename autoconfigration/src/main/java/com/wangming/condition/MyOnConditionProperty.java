package com.wangming.condition;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class MyOnConditionProperty implements org.springframework.context.annotation.Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata
                .getAnnotationAttributes(MyConditionOnProperty.class.getName());

        String prefix = String.valueOf(annotationAttributes.get("prefix"));

        return prefix.equals("pass");
    }
}
