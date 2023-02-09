package org.example.java.java.concurrent.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程6种状态：
 * 1、
 */
public class ThreadStateTest {

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
}
