package org.example.spring.web.handler;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * RestControllerAdvice
 *    修饰的类中所有{@link ExceptionHandler}方法都会增加{@link org.springframework.web.bind.annotation.ResponseBody}
 */
@RestControllerAdvice
public class RestControllerAdviceImpl {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){

    }

    @ModelAttribute
    public Object modelAttribute(){
        return "";
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exceptionHandler(Exception e){
        return null;
    }
}
