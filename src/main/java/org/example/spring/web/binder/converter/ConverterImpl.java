package org.example.spring.web.binder.converter;

import org.example.spring.web.binder.ConverterBean;
import org.springframework.core.convert.converter.Converter;

/**
 * 将S类型转换为T类型
 * name,age
 */
public class ConverterImpl implements Converter<String, ConverterBean> {
    @Override
    public ConverterBean convert(String source) {
        System.out.println("Converter");
        if(source.contains(",")){
            var strings = source.split(",");
            var converterBean = new ConverterBean();
            converterBean.setName(strings[0]);
            converterBean.setAge(Integer.parseInt(strings[1]));
            return converterBean;
        }
        return null;
    }
}
