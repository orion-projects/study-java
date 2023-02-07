package org.example.java.concurrent.atomic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link AtomicInteger}
 * {@link java.util.concurrent.atomic.AtomicIntegerArray}
 * {@link java.util.concurrent.atomic.AtomicIntegerFieldUpdater}
 * {@link java.util.concurrent.atomic.AtomicLong}
 * {@link java.util.concurrent.atomic.AtomicLongArray}
 * {@link java.util.concurrent.atomic.AtomicLongFieldUpdater}
 * {@link java.util.concurrent.atomic.AtomicReference}
 * {@link java.util.concurrent.atomic.AtomicReferenceArray}
 * {@link java.util.concurrent.atomic.AtomicReferenceFieldUpdater}
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AtomicIntegerTest {
    AtomicInteger atomic = null;

    @BeforeAll
    public void beforeAll(){
        atomic = new AtomicInteger(1);
    }

    @AfterAll
    public void afterAll(){
        System.out.println(atomic.get());
    }

    /**
     * 获取值
     */
    @Test
    public void getTest(){
        System.out.println(atomic.get());
    }

    /**
     * 先加一然后返回。
     */
    @Test
    public void incrementAndGetTest(){
        System.out.println(atomic.incrementAndGet());
    }

    /**
     * 先减一然后返回。
     */
    @Test
    public void decrementAndTest(){
        System.out.println(atomic.decrementAndGet());
    }

    @Test
    public void updateAndSet(){
        System.out.println(atomic.updateAndGet(x->Math.max(x, 10)));
    }

    @Test
    public void accumulateAndGetTest(){
        System.out.println(atomic.accumulateAndGet(10, Math::max));
    }
}
