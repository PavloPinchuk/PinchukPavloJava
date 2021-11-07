package com.univ.Task_5_21;

public class Hours {
    private int hours;

    public Hours(int hours) {
        try
        {
            if(hours < 0 || hours > 23)
                throw new IllegalArgumentException();
            this.hours = hours;
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Час должна быть значением от 0 до 59");
            this.hours = 0;
        }
    }

    public int getHours() {
        return hours;
    }
}
