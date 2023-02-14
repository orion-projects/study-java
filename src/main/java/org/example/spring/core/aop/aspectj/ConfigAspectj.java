package org.example.spring.core.aop.aspectj;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConfigAspectj {

    @Bean
    public AnnotationAwareAspectJAutoProxyCreator aspectJAutoProxyCreator(){
        return new AnnotationAwareAspectJAutoProxyCreator();
    }
}
