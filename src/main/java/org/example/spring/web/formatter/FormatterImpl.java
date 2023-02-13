package org.example.spring.web.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class FormatterImpl implements Formatter<org.example.spring.web.formatter.Formatter.Sex> {
    /**
     * 格式化输入
     * @param text the text string
     * @param locale the current user locale
     * @return
     * @throws ParseException
     */
    @Override
    public org.example.spring.web.formatter.Formatter.Sex parse(String text, Locale locale) throws ParseException {
        if(text.equals("boy")){
            return new org.example.spring.web.formatter.Formatter.Sex(0);
        }else {
            return new org.example.spring.web.formatter.Formatter.Sex(1);
        }
    }

    /**
     * 格式化输出
     * @param object the instance to print
     * @param locale the current user locale
     * @return
     */
    @Override
    public String print(org.example.spring.web.formatter.Formatter.Sex object, Locale locale) {
        if(object.equals(Integer.valueOf(0))){
            return "boy";
        }else {
            return "girl";
        }
    }
}
