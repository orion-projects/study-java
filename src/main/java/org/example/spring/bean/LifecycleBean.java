package org.example.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class LifecycleBean implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, InitializingBean, DisposableBean {


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

}
