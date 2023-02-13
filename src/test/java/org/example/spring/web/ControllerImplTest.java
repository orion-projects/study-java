package org.example.spring.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebMvcConfig.class)
public class ControllerImplTest {
    private RestTemplate restTemplate = new RestTemplate();
    
    @Test
    public void PathVariableTest(){
        var result = restTemplate.getForObject("http://localhost:8080/study/", String.class);
        System.out.println(result);
    }
}
