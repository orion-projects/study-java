package org.example.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<String> set = null;

    @BeforeEach
    public void beforeEach(){
        set = new HashSet<>(16);
        set.add("one");
        set.add("two");
        set.add("three");
    }
}
