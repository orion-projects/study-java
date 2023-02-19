package org.example.spring.web.i18n;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * 只有一个
 */
//@Configuration
public class I18nConfig {
    /**
     * 根据名为DEFAULT_COOKIE_NAME常量值的cookie属性客户端的Locale。
     * @return
     */
    @Bean
    public CookieLocaleResolver cookieLocaleResolver(){
        var bean = new CookieLocaleResolver();
        return bean;
    }

    /**
     * 根据名为LOCALE_SESSION_ATTRIBUTE_NAME常量值的session属性客户端的Locale。
     * @return
     */
    @Bean
    public SessionLocaleResolver sessionLocaleResolver(){
        var bean = new SessionLocaleResolver();
        return bean;
    }

    /**
     * 根据Accept-Language请求头确定客户端的Locale。
     * @return
     */
    @Bean
    public AcceptHeaderLocaleResolver acceptHeaderLocaleResolver(){
        return new AcceptHeaderLocaleResolver();
    }

   // @Bean
    public ResourceBundleMessageSource messageSource(){
        return new ResourceBundleMessageSource();
    }
}
