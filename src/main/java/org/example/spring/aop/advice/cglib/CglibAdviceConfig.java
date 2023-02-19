package org.example.spring.aop.advice.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CglibAdviceConfig {
    @Bean
    public CglibTarget target(){
        return new CglibTarget();
    }


}
