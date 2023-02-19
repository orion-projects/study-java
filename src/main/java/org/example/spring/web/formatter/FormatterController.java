package org.example.spring.web.formatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FormatterController {


    @RequestMapping("formatter")
    public Map<String, Object> formatter(FormatterBean formatter){
        var map = new HashMap<String, Object>();
        map.put("formatter", formatter);
        return map;
    }
}
