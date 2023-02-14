package org.example.spring.core.ioc.applicationcontext;

import org.example.spring.core.ioc.applicationcontext.ApplicationContextBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {

    @Bean("bean")
    public ApplicationContextBean applicationContextBean(){
        return new ApplicationContextBean();
    }
}
