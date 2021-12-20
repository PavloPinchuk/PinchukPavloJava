package com.univ;

import java.nio.ByteBuffer;

/**
 * Клас типу числа Unsigned
 */
public class Unsigned extends Number{

    /**
     * Ціле невід'ємне число
     */
    private byte[] bytes;

    /**
     * Конструктор
     * @param value число на вхід
     */
    public Unsigned(int value) {
        this.bytes = ByteBuffer.allocate(4).putInt(value).array();
    }

    /**
     * @return float value
     */
    @Override
    public float floatValue() {
        return  ByteBuffer.wrap(bytes).getFloat();
    }


    /**
     * @return double value
     */
    @Override
    public double doubleValue() {
        return  ByteBuffer.wrap(bytes).getDouble();
    }

    /**
     * @return int value
     */
    @Override
    public int intValue() {
        return ByteBuffer.wrap(bytes).getInt();
    }


    /**
     * @return long value
     */
    @Override
    public long longValue() {
        return ByteBuffer.wrap(bytes).getLong();
    }
}
