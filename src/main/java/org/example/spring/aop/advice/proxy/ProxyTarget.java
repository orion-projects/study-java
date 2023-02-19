package org.example.spring.aop.advice.proxy;

import org.example.spring.aop.advice.Advice;

public class ProxyTarget implements Advice {

    @Override
    public void method(boolean b) throws Exception{
        if(b){
            System.out.println("target");
        }else {
            throw new Exception();
        }
    }
}
