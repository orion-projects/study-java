package org.example.io.output;

import org.example.converter.ByteArrayConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class OutputStreamTest {
    private OutputStream outputStream = null;

    @BeforeEach
    public void beforeEach() throws FileNotFoundException {
        outputStream = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\OutputStream.txt"));
    }

    @ParameterizedTest
    @CsvSource("77")
    public void write(int b) throws IOException {
        outputStream.write(b);
        outputStream.close();
    }

    @ParameterizedTest
    @CsvSource("77.78.79")
    public void write(@ConvertWith(ByteArrayConverter.class) byte[] b) throws IOException {
        outputStream.write(b);
        outputStream.close();
    }

    @ParameterizedTest
    @CsvSource("77.78.79.80, 1, 2")
    public void write(@ConvertWith(ByteArrayConverter.class)byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
        outputStream.close();
    }

    @Test
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Test
    public void close() throws IOException {
        outputStream.close();
    }
}
