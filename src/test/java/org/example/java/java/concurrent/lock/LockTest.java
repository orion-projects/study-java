package org.example.java.java.concurrent.lock;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    /**
     * ReentrantLock可重入锁，线程可以反复获得已拥有的锁，线程每一次调用lock后都需要调用unlock来释放锁。
     */
    @Test
    public void lockTest(){
        var lock = new ReentrantLock();
        var thread = new Thread(()->{
            lock.lock();
            try {
                for (int i=0; i<10; i++){
                    System.out.println(i);
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });

        thread.start();
    }
}
