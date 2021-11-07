package com.univ.Task_6_16;

public class Check {
    private String owner;
    private double suma;
    private boolean blocked;

    public Check(String owner, double suma) {
        try{
            if(owner == "")
                throw new IllegalArgumentException();
            this.owner = owner;
        }
        catch (IllegalArgumentException ex){
            System.out.println("Owner name can't be empty.");
            this.owner = "undefined";
        }
        finally {
            this.suma = suma;
            this.blocked = false;
        }
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
