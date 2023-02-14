package org.example.spring.web.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ValidatorImpl implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        System.out.println(1);
        return true;
    }

    @Override
    public void validate(Object target, Errors errors) {
        System.out.println("2");
        if(target.equals("ValidatorImpl")){
            errors.rejectValue("str", "123", "hjahsd");
        }
    }
}
