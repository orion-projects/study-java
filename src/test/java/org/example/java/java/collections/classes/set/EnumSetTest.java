package org.example.java.java.collections.classes.set;

import org.junit.jupiter.api.BeforeEach;

import java.util.EnumSet;

public class EnumSetTest {
    private EnumSet<Enum> enumSet = null;

    public enum Enum{
        LARGE,SMALL
    }

    @BeforeEach
    public void beforeEach(){
        enumSet = EnumSet.of(Enum.LARGE, Enum.SMALL);
    }
}
