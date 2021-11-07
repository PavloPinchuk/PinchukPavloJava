package com.univ.Task_5_21;

public class Minutes {
    private int minutes;

    public Minutes(int minutes) {
        try
        {
            if(minutes < 0 || minutes > 59)
                throw new IllegalArgumentException();
            this.minutes = minutes;
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Минута должна быть значением от 0 до 59");
            this.minutes = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }
}
