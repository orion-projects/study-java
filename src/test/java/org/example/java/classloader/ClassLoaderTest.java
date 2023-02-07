package org.example.java.classloader;

import org.junit.jupiter.api.Test;

public class ClassLoaderTest {

    @Test
    public void test(){
        var classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader.getClass());
    }
}
