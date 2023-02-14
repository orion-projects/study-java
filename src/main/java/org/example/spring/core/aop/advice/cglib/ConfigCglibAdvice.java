package org.example.spring.core.aop.advice.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCglibAdvice {
    @Bean
    public CglibTarget target(){
        return new CglibTarget();
    }


}
