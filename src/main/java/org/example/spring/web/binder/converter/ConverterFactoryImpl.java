package org.example.spring.web.binder.converter;

import org.example.spring.web.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * 将S类型转换为T类型的基类
 */
public class ConverterFactoryImpl implements ConverterFactory<String, User> {
    @Override
    public <T extends User> Converter<String, T> getConverter(Class<T> targetType) {
        return (Converter<String, T>) new ConverterImpl();
    }
}
