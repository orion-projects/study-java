package org.example.spring.web.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class I18nConfig {
    @Bean
    public CookieLocaleResolver cookieLocaleResolver(){
        var bean = new CookieLocaleResolver();
        return bean;
    }

    @Bean
    public SessionLocaleResolver sessionLocaleResolver(){
        var bean = new SessionLocaleResolver();
        return bean;
    }
}
