package org.example.java.collections.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashSet;
import java.util.Iterator;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class IteratorTest {
    private Iterator<String> iterator = null;

    @BeforeEach
    public void beforeEach(){
        var set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        iterator = set.iterator();
    }

    /**
     * hasNext() 是否还有元素。
     * next() 返回下一个元素。
     * remove() 删除上次调用next()方法返回的元素。
     */
    @Test
    public void test(){
        while (iterator.hasNext()){
            var string = iterator.next();
            if(string.equals("two")){
                iterator.remove();
            }
        }
    }

    /**
     * 循环遍历所有元素。
     */
    @Test
    public void forEachRemainingTest(){
        iterator.forEachRemaining(System.out::println);
    }
}
