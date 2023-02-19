package org.example.spring.ioc.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifecycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanClassLoaderAware, InitializingBean, DisposableBean {
    private String name = null;

    public String getName() {
        System.out.println("getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    /**
     *
     * @param name the name of the bean in the factory.
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameWare:" + name);
    }

    /**
     *
     * @param beanFactory owning BeanFactory (never {@code null}).
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware:" + beanFactory);
    }

    /**
     *
     * @param classLoader the owning class loader
     */
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware:" + classLoader);
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    @Override
    public String toString(){
        return "LifecycleBean";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware");
    }
}
