package com.univ.Task_6_16;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<Check> checks;

    public Client(String name) throws EmptyNameException{
        if(name == "")
        {
            this.name = "undefined";
            this.checks = new ArrayList<>();
            throw new EmptyNameException("Owner name can't be empty.");
        }
        this.name = name;
        this.checks = new ArrayList<>();
    }

    public void addCheck(Check check) throws WrongNameException{
        if(check.getOwner() != name)
            throw new WrongNameException("Wrong owner of check", check.getOwner(), name);
        checks.add(check);
    }

    public void findCheck(int suma){
        for (Check check: checks
             ) {
            if(check.getSuma()<suma)
                System.out.println(check.getOwner() + " " + check.getSuma());
        }
    }
}
