package org.example.collections.classes.set;

import org.junit.jupiter.api.BeforeEach;

import java.util.TreeSet;

/**
 * public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>
 */
public class TreeSetTest {
    private TreeSet<String> treeSet = null;
    @BeforeEach
    public void beforeEach(){
        treeSet = new TreeSet<>();
    }
}
