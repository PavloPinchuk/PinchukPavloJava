package com.univ.Task_4_15;

public class Task_4_15_main {
    public static void main(){
        VectorR3 vector1 = new VectorR3(1,2,3);
        VectorR3 vector2 = new VectorR3(4,5,6);
        VectorR3 vector3 = new VectorR3(7,8,9);

        System.out.println("Vector1 and Vector2 is ortogonalni: " + vector1.checkOrt(vector2));
        System.out.println("Modul Vector3: " + vector3.getModul());
        vector1.checkBigger(vector2);
        System.out.println("Vector1, Vector2 and Vector3 is complanarni: " + vector1.checkComlanarni(vector2, vector3));
    }
}
