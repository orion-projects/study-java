package org.example.spring.web;

import org.example.spring.web.binder.ConverterBean;
import org.example.spring.web.binder.converter.ConverterImpl;
import org.example.spring.web.formatter.AnnotationFormatterFactoryImpl;
import org.example.spring.web.formatter.Formatter;
import org.example.spring.web.formatter.FormatterImpl;
import org.example.spring.web.interceptor.HandlerInterceptorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.lang.Nullable;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

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

    @Bean
    public ContentNegotiationManagerFactoryBean contentNegotiationManager(){
        var bean = new ContentNegotiationManagerFactoryBean();
        return bean;
    }

    @Bean
    public ContentNegotiatingViewResolver contentNegotiatingViewResolver(@Autowired ContentNegotiationManager contentNegotiationManager){
        var viewResolver = new ContentNegotiatingViewResolver();
        viewResolver.setOrder(0);
        return new ContentNegotiatingViewResolver();
    }

    /**
     *
     * @param configurer
     */
    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
    }

    /**
     * 配置内容裁决
      * @param configurer
     */
    @Override
    protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        super.configureContentNegotiation(configurer);

    }

    @Override
    protected void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        super.configureAsyncSupport(configurer);
    }

    /**
     * 配置默认静态资源处理器
     * @param configurer
     */
    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
    }

    /**
     * 配置格式化处理器
     * @param registry
     */
    @Override
    protected void addFormatters(FormatterRegistry registry) {
        super.addFormatters(registry);
        registry.addConverter(String.class, ConverterBean.class, new ConverterImpl());
        registry.addFormatterForFieldType(Formatter.Sex.class, new FormatterImpl());
        registry.addFormatterForFieldAnnotation(new AnnotationFormatterFactoryImpl());
    }

    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new HandlerInterceptorImpl());
    }

    /**
     * 配置静态资源
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
    }

    /**
     * 配置跨域
     * @param registry
     */
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
    }

    /**
     * 配置页面跳转
     * @param registry
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
       super.addViewControllers(registry);
    }

    /**
     * 配置视图解析器
     * @param registry
     */
    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);

    }

    /**
     * 配置参数解析器
     * @param argumentResolvers the list of custom converters (initially an empty list)
     */
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
    }

    @Override
    protected void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> returnValueHandlers) {
        super.addReturnValueHandlers(returnValueHandlers);
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
    }

    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.extendMessageConverters(converters);
    }

    @Override
    protected void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        super.configureHandlerExceptionResolvers(exceptionResolvers);
    }

    @Override
    protected void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
        super.extendHandlerExceptionResolvers(exceptionResolvers);
    }

    @Override
    @Nullable
    protected Validator getValidator() {
        return super.getValidator();
    }

    @Override
    @Nullable
    protected MessageCodesResolver getMessageCodesResolver() {
        return super.getMessageCodesResolver();
    }
}
