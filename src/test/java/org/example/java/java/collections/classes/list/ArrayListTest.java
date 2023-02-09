package org.example.java.java.collections.classes.list;

import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

/**
 * public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess
 *    ArrayList<E>实现类List<E>和RandomAccess接口。
 */
public class ArrayListTest {
    private ArrayList<String> arrayList = null;

    @BeforeEach
    public void beforeEach(){
        arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
    }
}
