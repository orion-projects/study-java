package org.example.spring.bean.config;

import org.example.spring.bean.LifecycleBean;
import org.example.spring.postprocessor.BeanPostProcessorImpl;
import org.example.spring.postprocessor.InstantiationAwareBeanPostProcessorImpl;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfig {

    @Bean
    public LifecycleBean getBean(){
        return new LifecycleBean();
    }

    @Bean
    public BeanPostProcessor getBeanPostProcessor(){
        return new BeanPostProcessorImpl();
    }

    @Bean
    public InstantiationAwareBeanPostProcessor getInstantiationAwareBeanPostProcessor(){
        return new InstantiationAwareBeanPostProcessorImpl();
    }
}
