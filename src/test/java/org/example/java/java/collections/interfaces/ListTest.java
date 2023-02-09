package org.example.java.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private List<String> list = null;
    private Collection<String> collection = null;

    @BeforeEach
    public void beforeEach(){
        list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");

        collection = new HashSet<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
    }

    /**
     * get(int index) 获取指定位置的元素。
     */
    @Test
    public void getTest(){
        System.out.println(list.get(1));
    }

    /**
     * set(int index, E e) 设置指定位置的元素。
     */
    @Test
    public void setTest(){
        list.set(1, "2");
        System.out.println(list);
    }

    /**
     * replaceAll()处理所有元素。
     */
    @Test
    public void replaceAllTest(){
        list.replaceAll((it)->Integer.toString(it.length()));
        System.out.println(list);
    }

    /**
     * indexOf(Object o) 元素o首次出现的位置。
     */
    @Test
    public void indexOfTest(){
        System.out.println(list.indexOf("one"));
    }

    /**
     * lastIndexOf(Object o) 元素o最后一次出现的位置。
     */
    @Test
    public void lastIndexOfTest(){
        System.out.println(list.lastIndexOf("one"));
    }

    /**
     * add(int index, E e) 在指定位置插入元素。
     */
    @Test
    public void addTest(){
        list.add(1, "1");
        System.out.println(list);
    }

    /**
     * addAll(int index, Collection<E> c) 在指定位置插入集合。
     */
    @Test
    public void addAllTest(){
        list.addAll(1, collection);
        System.out.println(list);
    }

    /**
     * remove(int index) 删除指定位置的元素。
     */
    @Test
    public void remove(){
        list.remove(1);
        System.out.println(list);
    }

    /**
     * 创建List集合
     */
    @Test
    public void ofTest(){
        System.out.println(List.of(1,2,3));
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10,11,12));
    }

    /**
     * subList(int from, int to)
     * 不包含from，包含to。
     */
    @Test
    public void subListTest(){
        System.out.println(list.subList(1, 2));
    }
}
