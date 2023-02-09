package org.example.java.java.concurrent.thread;

import org.junit.jupiter.api.Test;

public class ThreadInterruptTest {
    /**
     * interrupt()用来请求终止一个线程。
     * isInterrupted()检查线程是否被请求终止。
     */
    @Test
    public void interruptTest(){
        var thread = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println("not interrupt");
            }
            System.out.println("interrupt");
        });

        thread.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        thread.interrupt();
    }

    /**
     * 在一个interrupt线程上调用sleep()、wait()或join()方法时，将抛出InterruptException。
     */
    @Test
    public void InterruptExceptionTest(){
        var thread = new Thread(()->{
            try {
                Thread.sleep(10000);
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        thread.start();
        thread.interrupt();
    }
}
