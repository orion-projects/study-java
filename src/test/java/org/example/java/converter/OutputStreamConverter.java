package org.example.java.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class OutputStreamConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        try {
            return new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir") + source));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
