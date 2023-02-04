package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
    private Deque<String> deque = null;

    @BeforeEach
    public void beforeEach(){
        deque = new LinkedList<>();
        deque.add("one");
        deque.add("two");
        deque.add("three");
    }
}
