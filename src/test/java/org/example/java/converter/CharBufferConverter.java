package org.example.java.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.nio.CharBuffer;

public class CharBufferConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        return CharBuffer.allocate(Integer.parseInt(source.toString()));
    }
}
