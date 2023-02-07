package org.example.java.collections.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {
    private ListIterator<String> listIterator = null;

    @BeforeEach
    public void beforeEach(){
        var list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        listIterator = list.listIterator();
    }

    @Test
    public void nextTest(){
        while (listIterator.hasNext()){
            int index = listIterator.nextIndex();
            System.out.println(index + ":" + listIterator.next());
        }
        System.out.println();
        while ((listIterator.hasPrevious())){
            int index = listIterator.previousIndex();
            System.out.println(index + ":" + listIterator.previous());
        }
    }

    /**
     * 删除next()或previous()方法返回的元素。
     */
    @Test
    public void removeTest(){
        while (listIterator.hasNext()){
            listIterator.next();
        }
        listIterator.remove();
        while ((listIterator.hasPrevious())){
            listIterator.previous();
        }
        listIterator.remove();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    /**
     * 在迭代器位置之前添加一个元素。
     */
    @Test
    public void addTest(){
        while (listIterator.hasNext()){
            listIterator.next();
        }
        listIterator.add("four");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    /**
     * set()用一个新元素替换调用next()或previous()方法返回的上一个元素。
     */
    @Test
    public void setTest(){
        int i = 0;
        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.set(Integer.toString(i));
            i++;
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
