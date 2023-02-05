package org.example.collections.classes.set;

import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedHashSet;

/**
 * public class LinkedHashSet<E> extends HashSet<E> implements Set<E>
 */
public class LinkedHashSetTest {
    private LinkedHashSet<String> linkedHashSet = null;

    @BeforeEach
    public void beforeEach(){
        linkedHashSet = new LinkedHashSet<>();
    }
}
