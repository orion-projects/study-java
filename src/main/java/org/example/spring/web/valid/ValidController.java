package org.example.spring.web.valid;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ValidController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(new ValidatorImpl());
    }

    @RequestMapping("valid")
    public Map<String, Object> valid(@Valid ValidBean validBean, BindingResult bindingResult,
                                     @Valid String str, BindingResult bindingResultStr){
        for(var o : bindingResult.getFieldErrors()){
            System.out.println(o.getField());
        }
        for(var o : bindingResultStr.getFieldErrors()){
            System.out.println(o.getField());
        }
        var map = new HashMap<String, Object>();
        map.put("validBean", validBean);
        return map;
    }
}
