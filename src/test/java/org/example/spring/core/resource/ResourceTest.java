package org.example.spring.core.resource;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResourceTest {
    private static Resource resource = null;

    @BeforeAll
    public static void beforeAll(){
        resource = new ClassPathResource("spring/core/resource/resource.txt");
    }

    @Test
    public void exists(){
        System.out.println(resource.exists());
    }
}
