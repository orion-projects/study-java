package org.example.spring.core.ioc;

import org.example.spring.bean.LifecycleBean;
import org.example.spring.postprocessor.BeanPostProcessorImpl;
import org.example.spring.postprocessor.InstantiationAwareBeanPostProcessorImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryLifecycleTest {
    @Test
    public void lifecycleTest(){
        var factory = new DefaultListableBeanFactory();
        var reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("spring/core/ioc/BeanFactoryLifecycle.xml"));
        factory.addBeanPostProcessor(new BeanPostProcessorImpl());
        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessorImpl());
        var bean = factory.getBean("bean", LifecycleBean.class);
        System.out.println(bean.getName());
    }
}
