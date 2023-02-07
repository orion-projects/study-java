package org.example.java.converter;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.lang.reflect.Array;

/**
 * 将字符串参数转换成数组。
 */
public class ByteArrayConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if(source instanceof String string){
            if(string.contains(".")){
                var objects = string.split("\\.");
                var array = (byte[])Array.newInstance(targetType.getComponentType(), objects.length);
                for (int i=0; i<objects.length; i++){
                    array[i] = Byte.parseByte(objects[i]);
                }
                return array;
            }else {
                var num = Integer.parseInt((String) source);
                try {
                    return Array.newInstance(targetType.getComponentType(), num);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
