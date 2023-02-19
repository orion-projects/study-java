package org.example.spring.aop;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;

public class AopConfig {

    /**
     * beanNames属性配置Bean通配符。可以使用*通配符。
     * @return
     */
    @Bean
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
        return new BeanNameAutoProxyCreator();
    }

    /**
     * 扫描容器中的Advisor，并将Advisor自动织入匹配的目标Bean中。
     * @return
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();
    }

    /**
     * {@link org.aspectj.lang.annotation.Aspect}
     * @return
     */
    @Bean
    public AnnotationAwareAspectJAutoProxyCreator aspectJAutoProxyCreator(){
        return new AnnotationAwareAspectJAutoProxyCreator();
    }
}
