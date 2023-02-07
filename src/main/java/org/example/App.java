package org.example;

public class App {
    public static void main(String[] args){
        var classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader.getClass());
        System.out.println(classLoader.getParent().getClass());
        System.out.println(classLoader.getParent().getParent());
    }
}
