package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    private Queue<String> queue = null;

    @BeforeEach
    public void beforeEach(){
        queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
    }
}
