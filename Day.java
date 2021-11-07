package com.univ.Task_5_21;

public class Day {
    private Hours hours;
    private Minutes minutes;

    public Day(Hours hours, Minutes minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Day(int hours, int minutes){
        this.hours = new Hours(hours);
        this.minutes = new Minutes(minutes);
    }

    public void printTime(){
        System.out.println(hours.getHours() + " часов " + minutes.getMinutes() + " минут");
    }

    public void printDayTime(){
        if(hours.getHours() < 6){
            System.out.println("Night");
        }
        if(hours.getHours() >= 6 && hours.getHours() < 12){
            System.out.println("Morning");
        }
        if(hours.getHours() >= 12 && hours.getHours() < 18){
            System.out.println("Day");
        }
        if(hours.getHours() >= 18){
            System.out.println("Evening");
        }
    }
}
