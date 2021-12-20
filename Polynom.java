package com.univ;

/**
 * Клас Поліном
 * @param <T> тип коефіцієнтів
 */
public class Polynom<T extends Number> extends Number{
    /**
     * Коефіцієнт при першій степені
     */
    private T firstPow;
    /**
     * Вільний коефіцієнт
     */
    private T zeroPow;

    /**
     * Конструктор, з коефіцієнтами на вхід
     * @param firstPower коефіцієнт при першій степені
     * @param zeroPower вільний коефіцієнрт
     */
    public Polynom(T firstPower, T zeroPower) {
        this.firstPow = firstPower;
        this.zeroPow = zeroPower;
    }

    /**
     * Конструктор копіювання
     * @param p поліном на вхід
     */
    public Polynom(Polynom<T> p){
        this.firstPow = p.firstPow;
        this.zeroPow = p.zeroPow;
    }

    /**
     * @param result значення, якому дорівнює рівняння
     * @return double рішення лінійного рівняння
     */
    // решение линейного уравнения
    public double getLinearEquationResult(T result){
        return (result.doubleValue() - zeroPow.doubleValue()) / firstPow.doubleValue();
    }


    /**
     * @param result значення, якому дорівнює рівняння
     * @return double[] рішення квадратного рівняння
     */
    // решение квадратного уравнения (находим интеграл и приравниваем к 0)
    public String quadraticEquation(T result){
        double a = firstPow.doubleValue() / 2;
        double b = zeroPow.doubleValue();
        double c = -result.doubleValue();
        double[] results = new double[2];

        double d = b * b - 4 * a * c;
        if(d < 0) {
            return "Немає коренів в полі дійсних чисел";
        }
        if(d==0){
            if(a == 0)
            {
                if(b == 0)
                {
                    return "a=0, b=0, рівняння не має сенсу";
                }
                else
                {
                    return "x = " + Double.toString(-c/b);
                }
            }
            else
            {
                return "x = " + Double.toString((-b + Math.sqrt(d))/(2*a));
            }
        }
        if(d > 0){
            if(a == 0)
            {
                if(b == 0)
                {
                    return "a=0, b=0, equation does not make sense";
                }
                else
                {
                    return "x = " + Double.toString((-c/b));
                }
            }
            else
            {
                return "x1 = " + Double.toString((-b+Math.sqrt(d))/(2*a)) + "\n"
                        + "x2 = " + Double.toString((-b-Math.sqrt(d))/(2*a));
            }
        }
        return "";
    }

    /**
     * знайти значення полінома в точці
     * @param x точка
     * @return double значення полінома в точці
     */
    public double getPolynomValue(double x){
        return firstPow.doubleValue() * x + zeroPow.doubleValue();
    }

    /**
     * знайти похідну
     * @return T похідна
     */
    public T getDerivative(){
        return firstPow;
    }


    /**
     * визначений інтеграл
     * @param start від
     * @param end до
     * @return значення
     */
    public double defIntegral(double start, double end){
        double left = firstPow.doubleValue() / 2 * Math.pow(start, 2) +
                zeroPow.doubleValue() * start;
        double right = firstPow.doubleValue() / 2 * Math.pow(end, 2) +
                zeroPow.doubleValue() * end;
        return right - left;
    }

    /**
     * @return вільний коефіцієнт
     */
    public T getZeroPow() {
        return zeroPow;
    }

    /**
     * @param zeroPow вільний коефіцієнт
     */
    public void setZeroPow(T zeroPow) {
        this.zeroPow = zeroPow;
    }

    /**
     * @return коефіцієнт при першій степені
     */
    public T getFirstPow() {
        return firstPow;
    }

    /**
     * @param firstPow коефіцієнт при першій степені
     */
    public void setFirstPow(T firstPow) {
        this.firstPow = firstPow;
    }

    /**
     * @return int value
     */
    @Override
    public int intValue() {
        return zeroPow.intValue();
    }

    /**
     * @return long value
     */
    @Override
    public long longValue() {
        return (long) zeroPow;
    }

    /**
     * @return float value
     */
    @Override
    public float floatValue() {
        return (float) zeroPow;
    }

    /**
     * @return double value
     */
    @Override
    public double doubleValue() {
        return (double) zeroPow;
    }
}
