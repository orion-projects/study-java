package org.example.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.BitSet;

/**
 * public class BitSet
 *    用于读取、设置或重置各个位。
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BitSetTest {

    private BitSet bitSet = null;
    @BeforeEach
    public void beforeEach(){
        bitSet = new BitSet(0b1111_0000_1111_0000);
    }

    /**
     * BitSet()
     * BitSet(int initialCapacity)
     */
    @Test
    public void createTest(){
        new BitSet();
        new BitSet(0);
    }


}
