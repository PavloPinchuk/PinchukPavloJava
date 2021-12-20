package com.univ;

/**
 * Клас типу числа Rational
 */
public class Rational extends Number {

    /**
     * Значення
     */
    public double value;

    /**
     * Конструктор
     * @param value число на вхід
     */
    public Rational(double value) {
        this.value = value;
    }

    /**
     * @return float value
     */
    @Override
    public float floatValue() {
        return (float) value;
    }


    /**
     * @return double value
     */
    @Override
    public double doubleValue() {
        return value;
    }

    /**
     * @return int value
     */
    @Override
    public int intValue() {
        return (int) value;
    }

    /**
     * @return long value
     */
    @Override
    public long longValue() {
        return (long) value;
    }
}
