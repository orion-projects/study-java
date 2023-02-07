package org.example.io.reader;

import org.example.converter.CharArrayConverter;
import org.example.converter.CharBufferConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReaderTest {
    private Reader reader = null;

    @BeforeEach
    public void beforeEach() throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\reader.txt"), StandardCharsets.US_ASCII));
    }

    @Test
    public void read() throws IOException {
        System.out.println(reader.read());
    }

    @ParameterizedTest
    @CsvSource("10")
    public void read(@ConvertWith(CharArrayConverter.class)char[] cbuf) throws IOException {
        reader.read(cbuf);
        System.out.println(Arrays.toString(cbuf));
    }

    @ParameterizedTest
    @CsvSource("10, 1, 9")
    public void read(@ConvertWith(CharArrayConverter.class)char[] cbuf, int off, int len) throws IOException {
        reader.read(cbuf, off, len);
        for (int i=0; i<cbuf.length; i++){
            System.out.print(cbuf[i]);
        }
    }

    @ParameterizedTest
    @CsvSource("10")
    public void read(@ConvertWith(CharBufferConverter.class)CharBuffer target) throws IOException {
        reader.read(target);
        System.out.println(target.flip());
    }

    @ParameterizedTest
    @CsvSource("10")
    public void skip(long n) throws IOException {
        reader.skip(n);
    }

    /**
     * 在输入流的当前位置打一个标记。
     * @param readLimit 如果输入流中已读入的字节多于readLimit，则忽略这个标记。
     */
    @ParameterizedTest
    @CsvSource("2")
    public void mark(int readLimit) throws IOException {
        reader.mark(readLimit);
    }

    /**
     * 是否支持标记。
     */
    @Test
    public void markSupported(){
        System.out.println(reader.markSupported());
    }

    /**
     * 返回到最后一个标记，之后read的调用将重新读入这些字节。如果当前流没有任何标记，则流不被重置。
     * @throws IOException
     */
    @Test
    public void reset() throws IOException {
        reader.mark(2);
        reader.read();
        reader.reset();
    }
}
