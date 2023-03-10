package org.example.spring.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 通配符：
 * *：匹配上下文的中的任意一个元素
 * ..：匹配任意字符，可以匹配上下文中的多个元素。表示类时必须和*联合使用，表示入参时则单独使用。
 * +：按类型匹配指定类的所有类，必须跟在类名后面。
 */
@Aspect
public class Aspectj {
    /**
     * 标注了某个注解的方法。
     */
    @Pointcut("@annotation(org.example.spring.aop.aspectj.AspectjAnnotation)")
    private void annotation(){}

    /**
     * execution(<修饰符模式>? <返回类型模式> <方法名模式>(<参数模式>) <异常模式>?)
     */
    @Pointcut("execution(* org.example.spring.aop.aspectj+(..))")
    private void execution(){}

    /**
     * within(<类匹配模式>)
     */
    @Pointcut("within(org.example.spring.aop.aspectj+)")
    private void within(){}

    /**
     * 前置增强。
     */
    @Before("execution(* AspectjBean.before())")
    public void before(){

    }

    /**
     * Final增强。不管抛出异常还是正常退出，都会得到执行。一般用于释放资源。
     */
    @After("execution(* AspectjBean.after())")
    public void after(){

    }

    /**
     * 后置增强。
     */
    @AfterReturning("execution(* AspectjBean.afterReturning())")
    public void afterReturning(){

    }

    /**
     * 抛出增强。
     */
    @AfterReturning("execution(* AspectjBean.afterThrowing())")
    public void afterThrowing(){

    }

    /**
     * 环绕增强。
     * @param proceedingJoinPoint
     */
    @Around("execution(* AspectjBean.around())")
    public void around(ProceedingJoinPoint proceedingJoinPoint){

    }

    /**
     * 引介增强。
     */
    @DeclareParents(value = "AspectjBean", defaultImpl = AspectjInterfaceImpl.class)
    public AspectjInterface aspectjInterface;
}
