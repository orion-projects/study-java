package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTest {
    private NavigableSet<String> navigableSet = null;

    @BeforeEach
    public void beforeEach(){
        navigableSet = new TreeSet<String>();
        navigableSet.add("one");
        navigableSet.add("two");
        navigableSet.add("three");
    }
}
