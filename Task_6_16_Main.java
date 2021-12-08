package com.univ.Task_6_16;

public class Task_6_16_Main {
    public static void main(){
        try{
            Client client = new Client("Pasha");
            Check check1 = new Check("Pasha", 1000);
            Check check2 = new Check("Pasha", 800);
            Check check3 = new Check("Misha", 1200);
            try{
                client.addCheck(check1);
                client.addCheck(check2);
                client.addCheck(check3);
            }
            catch (WrongNameException e){
                System.out.println(e.getMessage());
                System.out.println(e.getName1() + " != " + e.getName2());
            }
            client.findCheck(1500);
        }
        catch (EmptyNameException ex){
            System.out.println(ex.getMessage());
        }
    }
}
