package com.wangming.service.impl;

import com.wangming.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@Profile("Java8")
public class Java8CalculateServiceImpl implements CalculateService {
    
    @Override
    public int calculate(Integer... arcgs) {
        System.out.println("java8实现");

        Integer sum = Stream.of(arcgs).reduce(0, Integer::sum);
        System.out.println("sum:"+sum);

        return sum;
    }



}
