package org.example.spring.web.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class FormatterImpl implements Formatter<FormatterBean.Sex> {
    /**
     * 格式化输入
     * @param text the text string
     * @param locale the current user locale
     * @return
     * @throws ParseException
     */
    @Override
    public FormatterBean.Sex parse(String text, Locale locale) throws ParseException {
        if(text.equals("boy")){
            return new FormatterBean.Sex(0);
        }else {
            return new FormatterBean.Sex(1);
        }
    }

    /**
     * 格式化输出
     * @param object the instance to print
     * @param locale the current user locale
     * @return
     */
    @Override
    public String print(FormatterBean.Sex object, Locale locale) {
        if(object.equals(Integer.valueOf(0))){
            return "boy";
        }else {
            return "girl";
        }
    }
}
