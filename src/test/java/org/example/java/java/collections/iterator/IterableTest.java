package org.example.java.java.collections.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class IterableTest {
    private Iterable<String> iterable = null;

    @BeforeEach
    public void beforeEach(){
        var hashSet = new HashSet<String>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        iterable = hashSet;
    }

    /**
     * iterator()获取迭代器。
     */
    @Test
    public void iteratorTest(){
        Assertions.assertNotNull(iterable.iterator());
    }

    /**
     * forEach(Consumer<? super T> action)循环处理所有元素。
     * @since 8
     */
    @Test
    public void foreachTest(){
        iterable.forEach(System.out::println);
    }

    /**
     * 获取一个spliterator对象。
     */
    @Test
    public void spliteratorTest(){
        Assertions.assertNotNull(iterable.spliterator());
    }
}
