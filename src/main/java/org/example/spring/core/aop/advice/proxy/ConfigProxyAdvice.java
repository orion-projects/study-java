package org.example.spring.core.aop.advice.proxy;

import org.example.spring.aop.advice.*;
import org.example.spring.core.aop.advice.*;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProxyAdvice {

    @Bean
    public MethodBeforeAdviceImpl methodBeforeAdvice(){
        return new MethodBeforeAdviceImpl();
    }

    @Bean
    public ProxyFactoryBean methodBeforeAdviceImpl() throws ClassNotFoundException {
        var proxyFactoryBean = new ProxyFactoryBean();
        var proxyTarget = new ProxyTarget();
        proxyFactoryBean.setTarget(proxyTarget);
        proxyFactoryBean.setProxyInterfaces(new Class[]{Advice.class});
        proxyFactoryBean.setInterceptorNames("methodBeforeAdvice");
        return proxyFactoryBean;
    }

    @Bean
    public MethodInterceptorImpl methodInterceptor(){
        return new MethodInterceptorImpl();
    }

    @Bean
    public ProxyFactoryBean methodInterceptorImpl() throws ClassNotFoundException {
        var proxyFactoryBean = new ProxyFactoryBean();
        var proxyTarget = new ProxyTarget();
        proxyFactoryBean.setTarget(proxyTarget);
        proxyFactoryBean.setProxyInterfaces(new Class[]{Advice.class});
        proxyFactoryBean.setInterceptorNames("methodInterceptor");
        return proxyFactoryBean;
    }

    @Bean
    public AfterReturningAdviceImpl afterReturningAdvice(){
        return new AfterReturningAdviceImpl();
    }

    @Bean
    public ProxyFactoryBean afterReturningAdviceImpl() throws ClassNotFoundException {
        var proxyFactoryBean = new ProxyFactoryBean();
        var proxyTarget = new ProxyTarget();
        proxyFactoryBean.setTarget(proxyTarget);
        proxyFactoryBean.setProxyInterfaces(new Class[]{Advice.class});
        proxyFactoryBean.setInterceptorNames("afterReturningAdvice");
        return proxyFactoryBean;
    }

    @Bean
    public ThrowsAdviceImpl throwsAdvice(){
        return new ThrowsAdviceImpl();
    }

    @Bean
    public ProxyFactoryBean throwsAdviceImpl() throws ClassNotFoundException {
        var proxyFactoryBean = new ProxyFactoryBean();
        var proxyTarget = new ProxyTarget();
        proxyFactoryBean.setTarget(proxyTarget);
        proxyFactoryBean.setProxyInterfaces(new Class[]{Advice.class});
        proxyFactoryBean.setInterceptorNames("throwsAdvice");
        return proxyFactoryBean;
    }
}
