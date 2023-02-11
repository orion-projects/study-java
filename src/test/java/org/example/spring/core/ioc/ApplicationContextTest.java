package org.example.spring.core.ioc;

import org.example.spring.bean.BeanImpl;
import org.example.spring.bean.config.ConfigureBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextTest {

    @Test
    public void classPathXmlApplicationContext(){
        var path = "spring/core/ioc/ClassPathXmlApplicationContext.xml";
        var applicationContext = new ClassPathXmlApplicationContext(path);
        System.out.println(applicationContext.getBean("bean", BeanImpl.class));
    }

    @Test
    public void fileSystemXmlApplicationContext(){
        var path = System.getProperty("user.dir") + "/src/test/resources/spring/core/ioc/FileSystemXmlApplicationContext.xml";
        var applicationContext = new FileSystemXmlApplicationContext(path);
        System.out.println(applicationContext.getBean("bean", BeanImpl.class));
    }

    @Test
    public void AnnotationConfigApplicationContext(){
        var applicationContext = new AnnotationConfigApplicationContext(ConfigureBean.class);
        System.out.println(applicationContext.getBean("bean", BeanImpl.class));
    }

}
