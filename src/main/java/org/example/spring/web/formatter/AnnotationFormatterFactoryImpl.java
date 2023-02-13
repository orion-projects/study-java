package org.example.spring.web.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.text.ParseException;
import java.util.Locale;
import java.util.Set;

public class AnnotationFormatterFactoryImpl implements AnnotationFormatterFactory<AnnotationFormatter> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        return Set.of(Double.class);
    }

    @Override
    public Printer<Double> getPrinter(AnnotationFormatter annotation, Class<?> fieldType) {
        System.out.println(11);
        return (object, locale) -> "$" + object;
    }

    @Override
    public Parser<Double> getParser(AnnotationFormatter annotation, Class<?> fieldType) {
        System.out.println(12);
        return new ParserImpl();
    }

    private static class ParserImpl implements Parser<Double>{

        @Override
        public Double parse(String text, Locale locale) throws ParseException {
            return 1.1;
        }
    }
}
