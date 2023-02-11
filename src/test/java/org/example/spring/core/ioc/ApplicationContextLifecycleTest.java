package org.example.spring.core.ioc;

import org.example.spring.bean.LifecycleBean;
import org.example.spring.bean.config.LifecycleConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextLifecycleTest {

    @Test
    public void applicationContextLifecycleTest(){
        var applicationContext = new AnnotationConfigApplicationContext(LifecycleConfig.class);
        var bean = applicationContext.getBean("getBean", LifecycleBean.class);
        System.out.println(bean.getName());
    }
}
