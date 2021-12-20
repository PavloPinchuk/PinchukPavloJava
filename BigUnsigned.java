package com.univ;

import java.math.BigInteger;

/**
 * Клас типу числа BigUnsigned
 */
public class BigUnsigned extends Number {

    /**
     * BigInteger з бібліотеки java.math
     */
    BigInteger value;

    /**
     * Конструктор
     * @param s рядок-число, яке передається в конструктор
     */
    public BigUnsigned(String s) {
        value = new BigInteger(s);
        if(value.intValue() < 0)
            value = new BigInteger(Integer.toString(value.intValue() * -1));
    }

    /**
     * @return float value
     */
    @Override
    public float floatValue() {
        return value.floatValue();
    }

    /**
     * @return double value
     */
    @Override
    public double doubleValue() {
        return value.doubleValue();
    }

    /**
     * @return int value
     */
    @Override
    public int intValue() {
        return value.intValue();
    }


    /**
     * @return long value
     */
    @Override
    public long longValue() {
        return value.longValue();
    }
}
