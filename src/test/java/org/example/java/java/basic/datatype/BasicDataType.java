package org.example.java.java.basic.datatype;

/**
 * 8种数据类型：4种整形、2种浮点类型、1种字符型、一种布尔类型。
 */
public class BasicDataType {

    /**
     * 一个字节。
     */
    public byte byteType;

    /**
     * 两个字节
     */
    public short shortType;

    /**
     * 四个字节
     */
    public int intType;

    /**
     * 八个字节
     */
    public long longType;

    /**
     * 四个字节
     */
    public float floatType;

    /**
     * 八个字节
     */
    public double doubleType;

    public char charType;

    public boolean booleanType;

    public void floatType(){
        // 负无穷
        var floatNegativeInfinity = Float.NEGATIVE_INFINITY;
        var doubleNegativeInfinity = Double.NEGATIVE_INFINITY;

        // 正无穷
        var floatPositiveInfinity = Float.POSITIVE_INFINITY;
        var doublePositiveInfinity = Double.POSITIVE_INFINITY;

        // NaN
        var floatNaN = Float.NaN;
        var doubleNaN = Double.NaN;

        // 判断是否为NaN
        Float.isNaN(1F);
        Double.isNaN(1);
    }


}
