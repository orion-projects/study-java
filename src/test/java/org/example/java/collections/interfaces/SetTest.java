package org.example.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void ofTest(){
        var collection = Set.of(1,2,3);
        System.out.println(collection);
    }
    @Test
    public void copyOfTest(){
        var collection = Set.copyOf(set);
        System.out.println(collection);
    }
}
