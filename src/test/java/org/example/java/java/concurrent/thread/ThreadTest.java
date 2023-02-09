package org.example.java.java.concurrent.thread;

import org.junit.jupiter.api.Test;

/**
 * 线程相关。
 */
public class ThreadTest {
    /**
     * 设置守护线程。
     */
    @Test
    public void setDaemonTest(){
        var thread = new Thread(()->{

        });

        thread.setDaemon(true);
        thread.start();
    }

    /**
     * 设置线程名字
     */
    @Test
    public void setNameTest(){
        var thread = new Thread(()->{

        });
        thread.setName("wcs");
        thread.start();
    }

    /**
     * 设置线程优先级。
     * MIN_PRIORITY：最小优先级。
     * NORM_PRIORITY：默认优先级。
     * MAX_PRIORITY：最大优先级。
     */
    @Test
    public void setPriority(){
        var thread = new Thread(()->{});

        thread.setPriority(Thread.MIN_PRIORITY);
    }

    /**
     * join 等待调用join的线程终止。
     */
    @Test
    public void joinTest(){
        var thread1 = new Thread(()->{
            for (int i=0; i<100; i++){
                System.out.println(1);
            }
        });

        var thread2 = new Thread(()->{
            for (int i=0; i<100; i++){
                System.out.println(2);
                if(i<50){
                    try {
                        // thread1.join();
                        thread1.join(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread2.start();
        thread1.start();
    }
}
