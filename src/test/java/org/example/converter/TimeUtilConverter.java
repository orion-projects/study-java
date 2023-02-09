package org.example.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.concurrent.TimeUnit;

public class TimeUtilConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if(source instanceof String string){
            if (string.equals("ms")){
                return TimeUnit.MILLISECONDS;
            } else if (string.equals("s")) {
                return TimeUnit.SECONDS;
            } else if (string.equals("ns")) {
                return TimeUnit.NANOSECONDS;
            }
        }
        return null;
    }
}
