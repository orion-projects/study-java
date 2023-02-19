package org.example.spring.web.handler;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerAdviceImpl {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

    }

    @ModelAttribute
    public Object modelAttribute(){
        return "";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(){
        return null;
    }
}
