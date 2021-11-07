package com.univ.Task_6_16;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Check> checks;

    public Client(String name){
        try {
            if(name == "")
                throw new IllegalArgumentException();
            this.name = name;
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Owner name can't be empty.");
        }
        finally {
            this.checks = new ArrayList<>();
        }
    }

    public void addCheck(Check check){
        try {
            if(check.getOwner() != name)
                throw new IllegalArgumentException();
            checks.add(check);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Wrong owner of check");
        }
    }

    public void findCheck(int suma){
        for (Check check: checks
             ) {
            if(check.getSuma()<suma)
                System.out.println(check.getOwner() + " " + check.getSuma());
        }
    }
}
