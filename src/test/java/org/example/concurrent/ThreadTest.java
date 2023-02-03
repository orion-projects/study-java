package org.example.concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程相关。
 */
public class ThreadTest {
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

    /**
     * New状态。
     * 使用new关键字创建后新线程时状态时NEW（新建）。
     */
    @Test
    public void newStateTest(){
        var thread = new Thread(()->{
            System.out.println("new State");
        });
        System.out.println(thread.getState());
    }

    /**
     * Start状态。
     * 调用start方法后线程状态时RUNNABLE（可运行）。
     */
    @Test
    public void runnableStateTest(){
        var thread = new Thread(()->{
            while (true){
            }
        });
        thread.start();
        System.out.println(thread.getState());
    }

    /**
     * Blocked状态。
     */
    @Test
    public void blockedTest(){
        var lock = new Object();
        var thread = new Thread(()->{
            synchronized (lock){
                System.out.println("获得对象内部锁");
            }
        });

        synchronized (lock){
            thread.start();
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        }
    }

    /**
     * Waiting状态。
     */
    @Test
    public void waitingTest(){
        var lock = new ReentrantLock();
        var thread = new Thread(()->{
            try {
                lock.lock();
                System.out.println("获得锁");
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        try {
            lock.lock();
            thread.start();
            Thread.sleep(1000);
            System.out.println(thread.getState());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    /**
     * Timed_Waiting
     */
    @Test
    public void timedWaitingTest(){
        var lock = new ReentrantLock();
        var thread = new Thread(()->{
            try {
                boolean result = lock.tryLock(2, TimeUnit.SECONDS);
                if(result){
                    System.out.println("获得锁");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        try {
            lock.lock();
            thread.start();
            Thread.sleep(1000);
            System.out.println(thread.getState());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    /**
     * Terminated状态
     */
    @Test
    public void terminatedTest(){
        var thread = new Thread(()->{

        });
        thread.start();

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(thread.getState());
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
     * 未捕获异常默认处理器。
     */
    @Test
    public void setDefaultUncaughtExceptionHandlerTest(){
        Thread.setDefaultUncaughtExceptionHandler(((t, e) -> System.out.println(t.getName() + ":" + e.getMessage())));
        var thread = new Thread(()->{
            var array = new int[10];
            System.out.println(array[10]);
        });
        thread.setName("thread1");
        thread.start();
        // 获得未捕获异常默认处理器
        var uncaught = Thread.getDefaultUncaughtExceptionHandler();

        thread = new Thread(()->{
            var array = new int[10];
            System.out.println(array[10]);
        });

        thread.setName("thread2");
        // 设置该线程的未捕获异常默认处理器。
        thread.setUncaughtExceptionHandler(((t, e) -> System.out.println(t.getName() + ": " + e.getMessage())));
        thread.start();

        // 获得该线程的未捕获异常默认处理器。
        uncaught = thread.getUncaughtExceptionHandler();
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


}
