package org.example.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

import java.util.Properties;

/**
 * public class Properties extends Hashtable<Object,Object>
 *     属性映射通常用于存储配置。
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class PropertiesTest {

    private Properties properties = null;

    @BeforeEach
    public void beforeEach(){
        properties = new Properties();
        properties.put("key", "value");
    }

}
