package org.example.spring.web;

import org.example.spring.web.binder.converter.ConverterImpl;
import org.example.spring.web.formatter.AnnotationFormatterFactoryImpl;
import org.example.spring.web.formatter.Formatter;
import org.example.spring.web.formatter.FormatterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.HashSet;
import java.util.List;
import java.util.Properties;

@Configuration
public class WebMvcConfig extends DelegatingWebMvcConfiguration {

    @Bean
    public ConversionServiceFactoryBean conversionService(){
        var bean = new ConversionServiceFactoryBean();
        var set = new HashSet<>();
        set.add(new ConverterImpl());
        bean.setConverters(set);
        return bean;
    }

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(){
        var bean = new FreeMarkerConfigurer();
        bean.setTemplateLoaderPath("/WEB-INF/FreeMarker");
        bean.setDefaultEncoding("UTF-8");
        var setting = new Properties();
        setting.put("classic_compatible", "true");
        bean.setFreemarkerSettings(setting);
        return bean;
    }

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver(){
        var bean = new FreeMarkerViewResolver();
        bean.setSuffix(".ftl");
        bean.setContentType("text/html; charset=utf-8");
        return bean;
    }

    @Bean
    public LocalValidatorFactoryBean localValidatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }

    /**
     * 配置FormattingConversionService。
     * @param registry
     */
    @Override
    protected void addFormatters(FormatterRegistry registry) {
        super.addFormatters(registry);
        registry.addConverter(String.class, User.class, new ConverterImpl());
        registry.addFormatterForFieldType(Formatter.Sex.class, new FormatterImpl());
        registry.addFormatterForFieldAnnotation(new AnnotationFormatterFactoryImpl());
    }

    /**
     * 配置HttpMessageConverter
     * @param converters a list to add message converters to (initially an empty list)
     */
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
    }

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
    }
}
