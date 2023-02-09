package org.example.java.java.concurrent.thread;

import org.junit.jupiter.api.Test;

public class ThreadUncaughtExceptionTest {
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
}
