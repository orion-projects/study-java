package org.example.spring.web.valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ValidController {

    @RequestMapping("valid")
    public Map<String, Object> valid(@Valid ValidBean validBean, BindingResult bindingResult){
        for(var o : bindingResult.getAllErrors()){
            System.out.println(o.toString());
        }
        var map = new HashMap<String, Object>();
        map.put("validBean", validBean);
        return map;
    }
}
