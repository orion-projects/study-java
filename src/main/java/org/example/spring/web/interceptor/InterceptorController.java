package org.example.spring.web.interceptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class InterceptorController {
    @RequestMapping("interceptor")
    public Map<String, Object> interceptor(){
        return Map.of("result", true);
    }
}
