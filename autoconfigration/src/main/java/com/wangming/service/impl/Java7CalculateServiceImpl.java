package com.wangming.service.impl;

import com.wangming.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Java7")
public class Java7CalculateServiceImpl implements CalculateService {

    @Override
    public int calculate(Integer... arcgs) {
        System.out.println("java7实现");
        int sum=0;
        for (int i=0;i<arcgs.length;i++)
        {
            sum+=arcgs[i];
        }
        System.out.println("sum:"+sum);
        return sum;
    }

}
