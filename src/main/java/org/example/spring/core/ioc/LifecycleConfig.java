package org.example.spring.core.ioc;

import org.example.spring.core.ioc.beanfactory.LifecycleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfig {

    @Bean("bean")
    public LifecycleBean lifecycleBean(){
        return new LifecycleBean();
    }
}
