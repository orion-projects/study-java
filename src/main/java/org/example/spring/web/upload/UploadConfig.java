package org.example.spring.web.upload;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class UploadConfig {
    @Bean("multipartResolver")
    public MultipartResolver multipartResolver(){
        var bean = new StandardServletMultipartResolver();
        return bean;
    }
}
