package org.example.spring.core.ioc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class ApplicationContextTest {
    private static ApplicationContext applicationContext = null;
    private static WebApplicationContext webApplicationContext = null;

    @BeforeAll
    public static void beforeAll(){
        applicationContext = new ClassPathXmlApplicationContext("spring/core/ioc/ApplicationContext.xml");
    }

    @Test
    public void classPathXmlApplicationContext(){
        new ClassPathXmlApplicationContext("spring/core/ioc/ClassPathXmlApplicationContext.xml");
    }

    @Test
    public void fileSystemXmlApplicationContext(){
        new FileSystemXmlApplicationContext("");
    }

    @Test
    public void conf(){
        new AnnotationConfigApplicationContext(ConfigureBean.class);
    }

    @Test
    public void web(){
        new AnnotationConfigWebApplicationContext();
    }
}
