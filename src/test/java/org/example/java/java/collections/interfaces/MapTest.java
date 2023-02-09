package org.example.java.java.collections.interfaces;

import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    private Map<String, String> map = null;

    @BeforeEach
    public void beforeEach(){
        map = new HashMap<>();
    }
}
