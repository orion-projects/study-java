package org.example.spring.web.handler.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class HandlerMappingConfig {

    /**
     * 通过mapping属性配置映射关系。
     * 只能将请求映射到控制器Bean，不能映射到具体方法。这种控制器类需要实现Controller接口。
     * @return
     */
    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping(){
        return new SimpleUrlHandlerMapping();
    }

    /**
     * 通过{@link org.springframework.web.bind.annotation.RequestMapping}配置控制器。
     * @return
     */
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
        return new RequestMappingHandlerMapping();
    }
}
