package org.example.java.collections.classes.list;

import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;

/**
 * public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>
 *     LinkedList<E>实现了List<E>、Queue<E>、Deque<E>接口。
 */
public class LinkedListTest {
    private LinkedList<String> linkedList = null;

    @BeforeEach
    public void beforeEach(){
        linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
    }
}
