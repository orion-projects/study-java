package org.example.spring.web.view;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class ViewResolverConfig {

    /**
     * 使用URL拼接的方式解析视图，通过prefix指定前缀，suffix指定后缀，将逻辑视图名加上前后缀得到实际视图。
     * 支持的前缀
     * 1、forward:
     *    转发到指定的视图资源。
     * 2、redirect:
     *    重定向到指定的视图资源。
     * viewClass
     *    解析成那种视图，必填。InternalResourceView用于JSP、JstlView用于JSTL。
     * @return
     */
    @Bean
    public UrlBasedViewResolver urlBasedViewResolver(){
        return new UrlBasedViewResolver();
    }

    /**
     * UrlBasedViewResolver子类，无需配置viewClass属性。
     * 如果类加载路径有JSTL类库，则使用JstlView。
     * 如果类加载路径没有JSTL类库，则使用InternalResourceView。
     * @return
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        return new InternalResourceViewResolver();
    }

    @Bean
    public BeanNameViewResolver beanNameViewResolver(){
        return new BeanNameViewResolver();
    }

    /**
     * 请求判断方式，优先级由高到低。
     * 1、根据请求的后缀。
     * 2、根据请求的参数（默认是format），需要将favorParameter参数设置为true。
     * 3、根据Accept请求头。
     *
     * 如何配置ViewResolver
     * 1、通过viewResolvers属性进行配置。
     * 2、ContentNegotiatingViewResolver自动扫描Spring容器中的所有Bean。
     * @return
     */
    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver(){
        return new ContentNegotiatingViewResolver();
    }
}
