package org.example.java.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        sortedSet.add("four");
        sortedSet.add("five");
        sortedSet.add("six");
        sortedSet.add("seven");
        sortedSet.add("eight");
        sortedSet.add("nine");
        sortedSet.add("ten");
        System.out.println(sortedSet);
    }

    @Test
    public void first(){
        System.out.println(sortedSet.first());
    }

    @Test
    public void last(){
        System.out.println(sortedSet.last());
    }

    @Test
    public void headSetTest(){
        System.out.println(sortedSet.headSet("s"));
    }

    @Test
    public void tailSetTest(){
        System.out.println(sortedSet.tailSet("s"));
    }

    @Test
    public void subSetTest(){
        System.out.println(sortedSet.subSet("five", "ten"));
    }

    @Test
    public void comparatorTest(){
        var comparator = sortedSet.comparator();
        // System.out.println(comparator.getClass().getName());
    }
}
