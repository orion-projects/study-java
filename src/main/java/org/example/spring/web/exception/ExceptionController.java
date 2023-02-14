package org.example.spring.web.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExceptionController {

    @RequestMapping("exception")
    @ResponseStatus(code = HttpStatus.BAD_GATEWAY, reason = "网关错误")
    public Map<String, Object> exception(Integer integer) throws Exception {
        if(integer==null || integer.equals(0)){
            throw new Exception();
        }

        return Map.of("integer", integer);
    }

   // @ExceptionHandler(Exception.class)
    public Map<String, Object> exceptionHandler(Exception e){
        System.out.println("exceptionHandler");
        var map = new HashMap<String , Object>();
        map.put("exception", e.getMessage());
        return map;
    }


    public String responseStatus(){
        System.out.println("ResponseStatus");
        return "1";
    }
}
