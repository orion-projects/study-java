package org.example.java.java.concurrent.task;

import org.example.converter.TimeUtilConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTaskTest {

    /**
     * public FutureTask(Callable<V> callable)
     * public FutureTask(Runnable runnable, V result)
     *    构造一个既是Future<V>又是Runnable的对象。
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void create() throws ExecutionException, InterruptedException {
        // public FutureTask(Callable<V> callable)
        var future1 = new FutureTask<>(() -> 10);
        var thread1 = new Thread(future1);
        thread1.start();
        System.out.println(future1.get());

        // public FutureTask(Runnable runnable, V result)
        var result = new Result();
        var future2 = new FutureTask<>(()->result.integer = 10, result);
        var thread2 = new Thread(future2);
        thread2.start();
        System.out.println(future2.get());
    }

    private static class Result{
        public Integer integer = null;

        @Override
        public String toString() {
            if(integer!=null){
                return integer.toString();
            }else {
                return null;
            }
        }
    }

    /**
     *    获取结果，该方法会阻塞。
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void get() throws ExecutionException, InterruptedException {
        var future = new FutureTask<>(() -> 10);
        var thread = new Thread(future);
        thread.start();
        System.out.println(future.get());
    }

    @ParameterizedTest
    @CsvSource("1000,ms")
    public void get(long time, @ConvertWith(TimeUtilConverter.class)TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        var future = new FutureTask<>(() -> 10);
        var thread = new Thread(future);
        thread.start();
        System.out.println(future.get(time, timeUnit));
    }

    /**
     * 尝试取消任务的运行。如果取消成功返回true。
     * @param mayInterrupt true：如果任务已经开始，就会被中断。
     */
    @ParameterizedTest
    @ValueSource(booleans = {true})
    public void cancel(boolean mayInterrupt){
        var future = new FutureTask<>(() -> 10);
        var thread = new Thread(future);
        thread.start();
        System.out.println(future.cancel(mayInterrupt));
    }

    /**
     * 如果任务在完成前被取消则返回true。
     */
    @Test
    public void isCancelled(){
        var future = new FutureTask<>(() -> 10);
        var thread = new Thread(future);
        thread.start();
        System.out.println(future.isCancelled());
    }

    /**
     * 如果任务结束，无论是否正常完成、中途取消还是发生异常都返回true。
     */
    @Test
    public void isDone(){
        var future = new FutureTask<>(() -> 10);
        var thread = new Thread(future);
        thread.start();
        System.out.println(future.isDone());
    }
}
