package com.univ.Task_3_8;

public class Chotirikutnik {
    private int a;
    private int b;
    private int c;
    private int d;

    public Chotirikutnik(int a, int b, int c, int d) {
        try{
            if(a<=0 || b<= 0 || c<= 0 || d<=0)
                throw new IllegalArgumentException();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        catch (IllegalArgumentException ex){
            System.out.println("Data cannot be less than one");
        }

    }

    public int getSquare() {
        return a * b;
    }

    public int getPerimeter() {
        return a + b + c + d;
    }
}
