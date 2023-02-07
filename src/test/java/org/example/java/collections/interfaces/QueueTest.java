package org.example.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.LinkedList;
import java.util.Queue;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class QueueTest {
    private Queue<String> queue = null;

    @BeforeEach
    public void beforeEach(){
        queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
    }

    /**
     * element() 返回队列队头元素。
     */
    @Test
    public void elementTest(){
        System.out.println(queue.element());
    }

    /**
     * peek() 返回队列队头元素。
     */
    @Test
    public void peekTest(){
        System.out.println(queue.peek());
    }

    /**
     * add(E e) 将元素e插入到队列尾部。
     */
    @Test
    public void addTest(){
        queue.add("four");
        System.out.println(queue);
    }

    /**
     * offer(E e) 将元素e插入队列尾部。
     */
    @Test
    public void offerTest(){
        queue.offer("four");
        System.out.println(queue);
    }

    /**
     * remove() 删除并返回队头元素。
     */
    @Test
    public void removeTest(){
        System.out.println(queue.remove());
    }

    /**
     * poll() 删除并返回队头元素。
     */
    @Test
    public void pollTest(){
        System.out.println(queue.poll());
    }
}
