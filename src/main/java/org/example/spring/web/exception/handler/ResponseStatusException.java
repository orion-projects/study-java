package org.example.spring.web.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "网关错误")
public class ResponseStatusException extends Exception{
    public ResponseStatusException(String message){
        super(message);
    }
}
