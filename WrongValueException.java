package com.univ.Task_5_21;

public class WrongValueException extends Exception{
    private int number;
    public int getNumber(){return number;}

    public WrongValueException(String message, int num){
        super(message);
        number = num;
    }
}
