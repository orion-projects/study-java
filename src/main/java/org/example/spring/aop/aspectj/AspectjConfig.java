package org.example.spring.aop.aspectj;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 开启{@link org.aspectj.lang.annotation.Aspect}
 * 1、xml配置
 *    <aop:aspectj-autoproxy/>或者配置{@link AnnotationAwareAspectJAutoProxyCreator}Bean。
 * 2、java配置
 *    使用{@link EnableAspectJAutoProxy}注解。
 */
@Configuration
@EnableAspectJAutoProxy
public class AspectjConfig {

    @Bean
    public AnnotationAwareAspectJAutoProxyCreator aspectJAutoProxyCreator(){
        return new AnnotationAwareAspectJAutoProxyCreator();
    }
}
