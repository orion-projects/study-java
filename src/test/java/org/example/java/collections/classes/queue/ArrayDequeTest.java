package org.example.java.collections.classes.queue;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayDeque;

/**
 * public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>
 */
public class ArrayDequeTest {

    private ArrayDeque<String> arrayDeque = null;

    @BeforeEach
    public void beforeEach(){
        arrayDeque = new ArrayDeque<>();
    }
}
