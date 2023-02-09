package org.example.java.java.concurrent.lock;

import org.junit.jupiter.api.Test;

public class VolatileTest {
    @Test
    public void volatileTest(){
        var v = new VolatileTest.Volatile(new Object());
        var thread = new Thread(() -> {
            try {
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(v.object);
            System.out.println(v.vObject);
            System.out.println(v.fObject);
        });
        var thread2 = new Thread(() -> {
            v.object = new Object();
            v.vObject = new Object();
        });
        thread.start();
        thread2.start();
    }

    private static class Volatile {
        public Object object = null;
        public volatile Object vObject = null;

        public final Object fObject;

        public Volatile(Object fObject){
            this.fObject = fObject;
        }
    }
}
