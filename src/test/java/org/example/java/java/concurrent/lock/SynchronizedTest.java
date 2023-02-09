package org.example.java.java.concurrent.lock;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class SynchronizedTest {

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

    private static class Synchronized {

        private int from = 100;
        private int to = 100;
        synchronized private void method(int num){
            from += num;
            to -= num;
        }

        public void transfer(){
            int j = new Random().nextInt(-10, 10);
            method(j);
        }

        @Override
        public String toString(){
            return from + to + "";
        }
    }
}
