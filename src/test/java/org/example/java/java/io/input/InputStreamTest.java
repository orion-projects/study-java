package org.example.java.java.io.input;

import org.example.converter.ByteArrayConverter;
import org.example.converter.OutputStreamConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.Arrays;

public class InputStreamTest {
    private InputStream inputStream = null;

    @BeforeEach
    public void beforeEach(){
        try {
            inputStream = new BufferedInputStream(new FileInputStream(System.getProperties().getProperty("user.dir") + "\\src\\test\\resources\\InputStream.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @throws IOException
     */
    @Test()
    public void read() throws IOException {
        System.out.println(inputStream.read());
    }

    /**
     *
     * @param b
     * @throws IOException
     */
    @ParameterizedTest
    @CsvSource("10")
    public void read(@ConvertWith(ByteArrayConverter.class) byte[] b) throws IOException {
        inputStream.read(b);
        System.out.println(Arrays.toString(b));
    }

    /**
     *
     * @param b
     * @param off
     * @param len
     * @throws IOException
     */
    @ParameterizedTest
    @CsvSource("10, 1, 8")
    public void read(@ConvertWith(ByteArrayConverter.class) byte[] b, int off, int len) throws IOException {
        inputStream.read(b, off, len);
        System.out.println(Arrays.toString(b));
    }

    /**
     * 读取所有字节。
     * @throws IOException
     * @since 9
     */
    @Test
    public void readAllBytes() throws IOException {
        System.out.println(Arrays.toString(inputStream.readAllBytes()));
    }

    /**
     * 如果未阻塞则读取len个字符。
     * @param len 读取字符的个数。
     * @throws IOException
     * @since 11
     */
    @ParameterizedTest
    @CsvSource("3")
    public void readNBytes(int len) throws IOException {
        System.out.println(Arrays.toString(inputStream.readNBytes(len)));
    }

    /**
     *
     * @param b
     * @param off
     * @param len
     * @throws IOException
     * @since 9
     */
    @ParameterizedTest
    @CsvSource("10, 1, 9")
    public void readNBytes(@ConvertWith(ByteArrayConverter.class) byte[] b, int off, int len) throws IOException {
        inputStream.readNBytes(b, off, len);
        System.out.println(Arrays.toString(b));
    }

    /**
     * 跳过n个字符。返回实际跳过的字符。
     * @param n 跳过的字符。
     * @throws IOException
     */
    @ParameterizedTest
    @CsvSource("2")
    public void skip(long n) throws IOException {
        inputStream.skip(n);
    }

    /**
     *
     * @param n
     * @throws IOException
     */
    @ParameterizedTest
    @CsvSource("2")
    public void skipNBytes(long n) throws IOException {
        inputStream.skipNBytes(n);
    }

    /**
     * 在输入流的当前位置打一个标记。
     * @param readLimit 如果输入流中已读入的字节多于readLimit，则忽略这个标记。
     */
    @ParameterizedTest
    @CsvSource("2")
    public void mark(int readLimit){
        inputStream.mark(readLimit);
    }

    /**
     * 是否支持标记。
     */
    @Test
    public void markSupported(){
        System.out.println(inputStream.markSupported());
    }

    /**
     * 返回到最后一个标记，之后read的调用将重新读入这些字节。如果当前流没有任何标记，则流不被重置。
     * @throws IOException
     */
    @Test
    public void reset() throws IOException {
        inputStream.mark(2);
        inputStream.readNBytes(10);
        inputStream.reset();
    }

    /**
     * 返回在不阻塞的情况下可获取的字节数。
     * @throws IOException
     */
    @Test
    public void available() throws IOException {
        inputStream.available();
    }

    /**
     * 关闭输入流。
     * @throws IOException
     */
    @Test
    public void close() throws IOException {
        inputStream.close();
    }

    /**
     * 将当前输入流中的所有字节传递到给定的输入流，返回传递的字节数。两个流都不应处于关闭状态。
     * @param outputStream
     * @throws IOException
     * @since 9
     */
    @ParameterizedTest
    @CsvSource("\\src\\test\\resources\\OutputStream.txt")
    public void transferTo(@ConvertWith(OutputStreamConverter.class)OutputStream outputStream) throws IOException {
        inputStream.transferTo(outputStream);
        outputStream.close();
    }
}
