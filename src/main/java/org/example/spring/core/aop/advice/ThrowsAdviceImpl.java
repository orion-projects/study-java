package org.example.spring.core.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceImpl implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("ThrowsAdvice");
    }
}
