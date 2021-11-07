package com.univ.Task_4_15;

import com.univ.Main;

public class VectorR3 {
    private int x;
    private int y;
    private int z;

    public VectorR3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean checkOrt(VectorR3 obj) {
        if (this.x * obj.x + this.y * obj.y + this.z * obj.z == 0)
            return true;
        return false;
    }

    public double getModul(){
        return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }

    public void checkBigger(VectorR3 obj){
        if(this.getModul() > obj.getModul())
        {
            System.out.println("First is bigger");
        }
        else
            if(this.getModul() < obj.getModul())
                System.out.println("Second is bigger");
            else
                System.out.println("Equal");
    }

    public boolean checkComlanarni(VectorR3 obj1, VectorR3 obj2){
        return ((this.x * obj1.y * obj2.z)
                - (this.x * obj1.z * obj2.y)
                - (this.y * obj1.x * obj2.z)
                - (this.z * obj1.y * obj2.x)
                + (this.y * obj1.z * obj2.x)
                + (this.z * obj1.x * obj2.y)) == 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
