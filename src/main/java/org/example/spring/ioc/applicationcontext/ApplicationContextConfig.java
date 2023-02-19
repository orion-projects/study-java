package org.example.spring.ioc.applicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {

    @Bean("bean")
    public ApplicationContextBean applicationContextBean(){
        return new ApplicationContextBean();
    }
}
