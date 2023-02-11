package org.example.spring.core.ioc;

import org.example.spring.bean.BeanImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
    private static DefaultListableBeanFactory beanFactory = null;

    @BeforeAll
    public static void beforeAll(){
        beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("spring/core/ioc/BeanFactory.xml"));
    }

    @Test
    public void getBean(){
        System.out.println(beanFactory.getBean("bean", BeanImpl.class));
    }
}
