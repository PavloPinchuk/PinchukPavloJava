package com.univ.Task_6_16;

public class Check {
    private String owner;
    private double suma;
    private boolean blocked;

    public Check(String owner, double suma) throws EmptyNameException {
        if(owner == "")
        {
            this.owner = "undefined";
            this.suma = suma;
            this.blocked = false;
            throw new EmptyNameException("Owner name can't be empty.");
        }
        this.owner = owner;
        this.suma = suma;
        this.blocked = false;
    }

    public void block(){
        this.blocked = true;
    }

    public void unblock(){
        this.blocked = false;
    }

    public double getSuma() {
        return suma;
    }

    public String getOwner() {
        return owner;
    }
}
