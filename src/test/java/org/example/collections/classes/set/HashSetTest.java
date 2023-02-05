package org.example.collections.classes.set;

import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;

/**
 * public class HashSet<E> extends AbstractSet<E> implements Set<E>
 */
public class HashSetTest {
    private HashSet<String> hashSet = null;

    @BeforeEach
    public void beforeEach(){
        hashSet = new HashSet<>();
    }
}
