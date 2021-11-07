package com.univ.Task_3_8;

import java.util.ArrayList;
import java.util.List;

public class Task_3_8_main {
    public static void main(){
        Chotirikutnik chotirikutnik1 = new Chotirikutnik(2,5,2,5);
        Chotirikutnik chotirikutnik2 = new Chotirikutnik(3,3,3,3);
        List<Chotirikutnik> list = new ArrayList<>();
        list.add(chotirikutnik1);
        list.add(chotirikutnik2);
        for (Chotirikutnik obj: list
             ) {
            System.out.println("Perimeter: " + obj.getPerimeter() + ", square: " + obj.getSquare());
        }
    }
}
