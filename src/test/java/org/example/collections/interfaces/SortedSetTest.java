package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    private SortedSet<String> sortedSet = null;

    @BeforeEach
    public void beforeEach(){
        sortedSet = new TreeSet<String>();
        sortedSet.add("one");
        sortedSet.add("two");
        sortedSet.add("three");
    }
}
