package org.example.java.concurrent;

import org.example.concurrent.Account;
import org.example.concurrent.Synchronized;
import org.example.concurrent.Volatile;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedTest {
    /**
     * ReentrantLock可重入锁。
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

    /**
     *
     */
    @Test
    public void awaitTest(){
        var random = new Random();
        var account1 = new Account(100);
        var account2 = new Account(100);
        var lock = new ReentrantLock();
        var condition = lock.newCondition();
        var thread1 = new Thread(()->{
            for (int i=0; i<1000; i++){
                var j = random.nextInt(0, 10);
                lock.lock();
                try {
                    while (account2.getCount()<j){
                        condition.await();
                    }
                    account1.plus(j);
                    account2.plus(-j);
                    condition.signalAll();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        var thread2 = new Thread(()->{
            for (int i=0; i<1000; i++){
                var j = random.nextInt(0, 10);
                lock.lock();
                try {
                    while (account2.getCount()<j){
                        condition.await();
                    }
                    account1.plus(j);
                    account2.plus(-j);
                    condition.signalAll();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("account1:" + account1.getCount() + " account2:" + account2.getCount() +
                " total:" + (account1.getCount() + account2.getCount()));
    }

    @Test
    public void synchronizedTest(){
        var sync = new Synchronized();
        var thread1 = new Thread(()->{
            for (int i=0; i<1000; i++){
                sync.transfer();
            }
        });
        var thread2 = new Thread(()->{
            for (int i=0; i<1000; i++){
                sync.transfer();
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(sync);
    }

    @Test
    public void volatileTest(){
        Volatile v = new Volatile(new Object());
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(v.object);
                System.out.println(v.vObject);
                System.out.println(v.fObject);
            }
        });
        var thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                v.object = new Object();
                v.vObject = new Object();
            }
        });
        thread.start();
        thread2.start();
    }
}
