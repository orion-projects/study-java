package org.example.java.java.concurrent.thread;

import org.junit.jupiter.api.Test;

public class ThreadCreateTest {
    /**
     * Runnable接口。
     */
    @Test
    public void runnableTest(){
        var thread = new Thread(()->{
            for (int i=0; i<10; i++){
                System.out.println(i);
            }
        });
        thread.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 继承Thread类，重写run方法。
     */
    @Test
    public void threadTest(){
        var thread = new ThreadImpl();
        thread.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static class ThreadImpl extends Thread{

        @Override
        public void run(){
            for (int i=0; i<10; i++){
                System.out.println(i);
            }
        }
    }
}
