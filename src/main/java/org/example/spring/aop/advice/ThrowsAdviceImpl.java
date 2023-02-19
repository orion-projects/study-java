package org.example.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdviceImpl implements ThrowsAdvice {
    public void afterThrowing(Exception e){
        System.out.println("ThrowsAdvice");
    }
}
