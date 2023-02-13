package org.example.spring.web.binder.converter;

import org.example.spring.web.User;
import org.springframework.core.convert.converter.Converter;

/**
 * 将S类型转换为T类型
 * name,age
 */
public class ConverterImpl implements Converter<String, User> {
    @Override
    public User convert(String source) {
        System.out.println("Converter");
        if(source.contains(",")){
            var strings = source.split(",");
            var user = new User();
            user.setName(strings[0]);
            user.setAge(Integer.parseInt(strings[1]));
            return user;
        }
        return null;
    }
}
