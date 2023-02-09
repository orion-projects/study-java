package org.example.java.java.concurrent.lock;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
    /**
     *
     */
    @Test
    public void awaitTest(){
        var random = new Random();
        var account1 = new ConditionTest.Account(100);
        var account2 = new ConditionTest.Account(100);
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

    private static class Account {
        private int count;

        public Account(int count){
            this.count = count;
        }

        public void plus(int num){
            count += num;
        }

        public int getCount(){
            return this.count;
        }
    }
}
