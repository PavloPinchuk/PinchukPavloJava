package com.univ.Task_6_16;

public class Task_6_16_Main {
    public static void main(){
        Client client = new Client("Pasha");
        Check check1 = new Check("Pasha", 1000);
        Check check2 = new Check("Misha", 1200);
        Check check3 = new Check("Pasha", 800);
        client.addCheck(check1);
        client.addCheck(check2);
        client.addCheck(check3);
        client.findCheck(1500);
    }
}
