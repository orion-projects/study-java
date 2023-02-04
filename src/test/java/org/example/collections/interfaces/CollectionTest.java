package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CollectionTest {
    private Collection<String> collection = null;
    private Collection<String> collection2 = null;

    @BeforeEach
    public void beforeEach(){
        collection = new HashSet<>(16);
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection2 = new HashSet<>(16);
        collection2.add("two");
        collection2.add("three");
        collection2.add("four");
    }

    /**
     * size()返回集合的大小。
     */
    @Test
    public void sizeTest(){
        System.out.println(collection.size());
    }

    /**
     * isEmpty()判断集合是否为空。
     */
    @Test
    public void isEmptyTest(){
        System.out.println(collection.isEmpty());
    }

    @Test
    public void clearTest(){
        collection.clear();
        System.out.println(collection);
    }

    /**
     * <T> T[] toArray(T[] a);
     * <T> T[] toArray(IntFunction<T[]> generator)
     * 将集合转变成数组。
     */
    @Test
    public void toArrayTest(){
        System.out.println(Arrays.toString(collection.toArray(new String[collection.size()])));
        System.out.println(Arrays.toString(collection.toArray(String[]::new)));
    }

    @Test
    public void addTest(){
        collection.add("four");
        System.out.println(collection);
    }

    /**
     * 并集
     */
    @Test
    public void addAllTest(){
        collection.addAll(collection2);
        System.out.println(collection);
    }

    @Test
    public void removeTest(){
        collection.remove("one");
        System.out.println(collection);
    }

    @Test
    public void removeIfTest(){
        collection.removeIf((it)->it.length()>4);
        System.out.println(collection);
    }

    /**
     * 差集。
     */
    @Test
    public void removeAllTest(){
        collection.removeAll(collection2);
        System.out.println(collection);
    }

    /**
     * contains(Object o) 集合是否包含元素o。
     */
    @Test
    public void containsTest(){
        System.out.println(collection.contains("one"));
    }

    /**
     * containsAll(Collection<?> c) 是否包含集合c的所有元素。 判断是否为子集。
     */
    @Test
    public void containsAllTest(){
        System.out.println(collection.containsAll(collection2));
    }

    /**
     * 交集
     */
    @Test
    public void retainAllTest(){
        collection.retainAll(collection2);
        System.out.println(collection);
    }

    /**
     * 流。
     */
    @Test
    public void streamTest(){
        var stream = collection.stream();
    }

    /**
     * 并行流。
     */
    @Test
    public void parallelStreamTest(){
        var stream = collection.parallelStream();
    }
}
