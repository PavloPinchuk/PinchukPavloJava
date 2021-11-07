package com.univ.Task_5_21;

public class Task_5_21_Main {
    public static void main(){
        Minutes minutes = new Minutes(25);
        Hours hours = new Hours(12);
        Day day = new Day(hours, minutes);
        day.printTime();
        day.printDayTime();

        Minutes minutes2 = new Minutes(65);
        Hours hours2 = new Hours(-2);
        Day day2 = new Day(hours2, minutes2);
        day2.printTime();
        day2.printDayTime();
    }
}
