package org.example.spring.bean.config;

import org.example.spring.bean.BeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureBean {
    @Bean("bean")
    public BeanImpl getBean(){
        return new BeanImpl();
    }

}
