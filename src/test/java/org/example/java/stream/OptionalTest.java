package org.example.java.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    private Optional<String> optional = null;
    private Optional<String> optionalNull = null;

    @BeforeEach
    public void beforeEach(){
        optional = Optional.of("old");
        optionalNull = Optional.empty();
    }

    /**
     * Optional.of(T value);
     * Optional.ofNullable(T value);
     * Optional.empty();
     *    创建Optional对象。
     */
    @Test
    public void create(){
        Optional.of("o");
        Optional.ofNullable(null);
        Optional.empty();
    }

    @Test
    public void orElseTest(){
        System.out.print("orElse:" + optional.orElse("new") + " ");
        System.out.println(optionalNull.orElse("new"));
        System.out.print("orElseGet:" + optional.orElseGet(()->"new") + " ");
        System.out.println(optionalNull.orElseGet(()->"new") + " ");
        System.out.print("orElseThrow:" + optional.orElseThrow() + " ");
        try {
            System.out.println(optionalNull.orElseThrow(()->new Exception("new")));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void ifTest(){
        optional.ifPresent(System.out::println);
        optionalNull.ifPresent(System.out::println);
        optional.ifPresentOrElse(System.out::println, ()->System.out.println("new"));
        optionalNull.ifPresentOrElse(System.out::println, ()->System.out.println("new"));
    }

    @Test
    public void mapTest(){
        System.out.println(optional.map(it->it + "1"));
    }

    @Test
    public void filterTest(){
        System.out.println(optional.filter(it->it.length()>1));
    }

    @Test
    public void orTest(){
        System.out.println(optional.or(()->Optional.of("new")));
        System.out.println(optionalNull.or(()-> Optional.of("new")));
    }

    @Test
    public void getTest(){
        System.out.println(optional.get());
    }

    @Test
    public void ifPresentTest(){
        System.out.println(optional.isPresent());
    }

    @Test
    public void flatMapTest(){
        System.out.println(optional.flatMap((it)->Optional.of(it.length())));
    }

    @Test
    public void streamTest(){
        optional.stream().forEach(System.out::println);
    }
}
