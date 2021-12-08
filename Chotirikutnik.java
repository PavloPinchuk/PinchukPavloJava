package com.univ.Task_3_8;

public class Chotirikutnik {
    private int a;
    private int b;
    private int c;
    private int d;

    public Chotirikutnik(int a, int b, int c, int d) throws SideException {
        if(a<=0)
            throw new SideException("Data cannot be less than one", a);
        if(b<=0)
            throw new SideException("Data cannot be less than one", b);
        if(c<=0)
            throw new SideException("Data cannot be less than one", c);
        if(d<=0)
            throw new SideException("Data cannot be less than one", d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getSquare() {
        return a * b;
    }

    public int getPerimeter() {
        return a + b + c + d;
    }
}
