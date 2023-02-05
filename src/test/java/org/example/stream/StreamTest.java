package org.example.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class StreamTest {

    private Stream<String> stream = null;

    @BeforeEach
    public void beforeEach(){
        stream = Stream.of("a\na", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q");
    }

    /**
     * 创建流。
     */
    @Test
    public void createTest(){
        Stream.of("a", "b", "c");
        Stream.empty();
        Stream.iterate(1, (it)->it*2-1);
        Stream.iterate(1, it->it<1000, it->it*2-1);
        Stream.generate(()->new Random().nextInt());
        Stream.ofNullable("a");
    }

    /**
     * 过滤流
     */
    @Test
    public void filterTest(){
        var s = stream.filter(it->it.compareTo("e")>0);
        s.forEach(System.out::printf);
    }

    /**
     * <R> Stream<R> map(Function<? super T, ? extends R> mapper);
     *    将mapper处理的结果应用到当前流，如果mapper处理的结果是个流则当前流的每个元素也是流。
     */
    @Test
    public void mapTest(){
        var s = stream.map(it->it.codePointAt(0));
        s.forEach(System.out::println);
    }

    /**
     * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
     *    将mapper处理得到流连接到当前流。
     */
    @Test
    public void flatMapTest(){
        var s = stream.flatMap(String::lines);
        s.forEach(System.out::println);
    }

    @Test
    public void limitTest(){
        var s = stream.limit(10);
        s.forEach(System.out::println);
    }

    @Test
    public void skipTest(){
        var s = stream.skip(10);
        s.forEach(System.out::println);
    }

    @Test
    public void takeWhileTest(){
        var s = stream.takeWhile(it->it.compareTo("e")>0);
        s.forEach(System.out::println);
    }

    @Test
    public void dropWhileTest(){
        var s = stream.dropWhile(it->it.compareTo("e")>0);
        s.forEach(System.out::println);
    }

    @Test
    public void concatTest(){

    }


}
