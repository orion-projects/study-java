package org.example.java.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class StreamTest {

    private Stream<String> stream = null;

    @BeforeEach
    public void beforeEach(){
        stream = Stream.of("aa", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q");
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

    @Test
    public void distinctTest(){
        var s = stream.distinct();
        s.forEach(System.out::println);
    }

    @Test
    public void sortedTest(){
        var s = stream.sorted();
        s.sorted((Comparator.comparingInt(o -> -o.codePointAt(0))))
                .forEach(System.out::println);
    }

    @Test
    public void peekTest(){
        stream.peek(it->System.out.println(it + "a")).forEach(System.out::println);
    }

    @Test
    public void minTest(){
        System.out.println(stream.min(Comparator.comparingInt(o->o.codePointAt(0))));
    }

    @Test
    public void maxTest(){
        System.out.println(stream.max(Comparator.comparingInt(o->o.codePointAt(0))));
    }

    @Test
    public void findFirstTest(){
        System.out.println(stream.findFirst());
    }

    @Test
    public void findAnyTest(){
        System.out.println(stream.findAny());
    }

    @Test
    public void anyMatchTest(){
        System.out.println(stream.anyMatch(o->o.length()>1));
    }

    @Test
    public void allMatchTest(){
        System.out.println(stream.allMatch(o->o.length()>=1));
    }

    @Test
    public void noneMatchTest(){
        System.out.println(stream.noneMatch(o->o.length()>3));
    }

    @Test
    public void forEachTest(){
        stream.forEach(System.out::println);
    }

    @Test
    public void collectTest(){
        System.out.println(stream.collect(Collectors.toCollection(TreeSet::new)).toString());
        System.out.println(stream.collect(Collectors.toSet()));
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println(stream.collect(Collectors.toUnmodifiableSet()));
        System.out.println(stream.collect(Collectors.toUnmodifiableList()));
        System.out.println(stream.collect(Collectors.joining()));
        System.out.println(stream.collect(Collectors.joining("/")));
        System.out.println(stream.collect(Collectors.toMap(Function.identity(), Function.identity())));
        /*System.out.println(stream.collect(
                Collectors.toMap(
                        Function.identity(),
                        Function.identity(),
                        BinaryOperator.maxBy((a, b)->{
                            return a.compareTo(b);
                        }),
                        TreeMap::new)));*/
    }


}
