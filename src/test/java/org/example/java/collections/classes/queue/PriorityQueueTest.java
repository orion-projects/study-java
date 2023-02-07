package org.example.java.collections.classes.queue;

import org.junit.jupiter.api.BeforeEach;

import java.util.PriorityQueue;

/**
 * public class PriorityQueue<E> extends AbstractQueue<E>
 */
public class PriorityQueueTest {
    private PriorityQueue<String> priorityQueue = null;

    @BeforeEach
    public void beforeEach(){
        priorityQueue = new PriorityQueue<>();
    }
}
