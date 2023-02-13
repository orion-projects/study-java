package org.example.spring.web.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestControllerImpl {

    @RequestMapping("a")
    public Map<String, String> t(){
        var map = new HashMap<String, String>();
        map.put("key", "value");

        return map;
    }
}
