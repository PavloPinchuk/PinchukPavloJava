package com.univ.Task_3_8;

public class SideException extends Exception{
    private int number;
    public int getNumber(){return number;}

    public SideException(String message, int num){
        super(message);
        number = num;
    }
}
