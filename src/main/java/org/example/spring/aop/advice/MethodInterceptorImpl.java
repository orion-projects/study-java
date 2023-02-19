package org.example.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodInterceptorImpl implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before");
        var result = invocation.proceed();
        System.out.println("after");
        return result;
    }
}
