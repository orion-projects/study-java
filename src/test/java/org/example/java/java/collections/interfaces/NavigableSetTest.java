package org.example.java.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
    private NavigableSet<String> navigableSet = null;

    @BeforeEach
    public void beforeEach(){
        navigableSet = new TreeSet<String>();
        navigableSet.add("one");
        navigableSet.add("two");
        navigableSet.add("three");
        navigableSet.add("four");
        navigableSet.add("five");
        navigableSet.add("six");
        navigableSet.add("seven");
        navigableSet.add("eight");
        navigableSet.add("nine");
        navigableSet.add("ten");
        System.out.println(navigableSet);
    }

    /**
     * ceiling(E value) 大于等于value的最小元素。
     */
    @Test
    public void ceilingTest(){
        System.out.println(navigableSet.ceiling("g"));
    }

    /**
     * higher(E value) 大于value的最小元素。
     */
    @Test
    public void higherTest(){
        System.out.println(navigableSet.higher("g"));
    }

    /**
     * floor(E value) 小于等于value的最大元素。
     */
    @Test
    public void floorTest(){
        System.out.println(navigableSet.floor("g"));
    }

    /**
     * lower(E value) 小于value的最大元素。
     */
    @Test
    public void lowerTest(){
        System.out.println(navigableSet.lower("g"));
    }

    /**
     * pollFirst() 删除并返回最小元素。
     */
    @Test
    public void pollFirstTest(){
        System.out.println(navigableSet.pollFirst());
    }

    /**
     * pollLast() 删除并返回最大元素。
     */
    @Test
    public void pollLastTest(){
        System.out.println(navigableSet.pollLast());
    }

    /**
     * descendingIterator() 返回一个按照降序遍历的迭代器。
     */
    @Test
    public void descendingIteratorTest(){
        var iterator = navigableSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * descendingSet() 返回一个顺序相反的NavigableSet。
     */
    @Test
    public void descendingSetTest(){
        var set = navigableSet.descendingSet();
        System.out.println(set);
    }

    @Test
    public void headSetTest(){
        System.out.println(navigableSet.headSet("one", true));
    }

    @Test
    public void tailSetTest(){
        System.out.println(navigableSet.tailSet("one", true));
    }

    @Test
    public void subSetTest(){
        System.out.println(navigableSet.subSet("one", true, "two", false));
    }
}
