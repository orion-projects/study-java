package org.example.spring.aop;

import org.example.spring.aop.advice.Advice;
import org.example.spring.aop.advice.MethodBeforeAdviceImpl;
import org.example.spring.aop.advice.proxy.ProxyAdviceConfig;
import org.example.spring.aop.advice.proxy.ProxyTarget;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProxyAdviceConfig.class})
public class ProxyAdviceTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void proxyTest() throws Exception{
        var target = new ProxyTarget();
        var advice = new MethodBeforeAdviceImpl();
        var proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);
        var result = (ProxyTarget)proxyFactory.getProxy();
        result.method(true);
    }

    @Test
    public void MethodBeforeAdviceTest() throws Exception {
        applicationContext.getBean("methodBeforeAdviceImpl", Advice.class).method(true);
    }

    @Test
    public void methodInterceptorTest() throws Exception {
        applicationContext.getBean("methodInterceptorImpl", Advice.class).method(true);
    }

    @Test
    public void afterReturningAdviceTest() throws Exception {
        applicationContext.getBean("afterReturningAdviceImpl", Advice.class).method(true);
    }

    @Test
    public void throwsAdviceTest() throws Exception {
        applicationContext.getBean("throwsAdviceImpl", Advice.class).method(false);
    }
}
