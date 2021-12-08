package com.univ.Task_3_8;

import java.util.ArrayList;
import java.util.List;

public class Task_3_8_main {
    public static void main(){
        List<Chotirikutnik> list = new ArrayList<>();
        try{
            Chotirikutnik chotirikutnik1 = new Chotirikutnik(2,5,2,5);
            list.add(chotirikutnik1);
        }
        catch (SideException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

        try{
            Chotirikutnik chotirikutnik2 = new Chotirikutnik(3,-3,3,3);
            list.add(chotirikutnik2);
        }
        catch (SideException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

        for (Chotirikutnik obj: list
             ) {
            System.out.println("Perimeter: " + obj.getPerimeter() + ", square: " + obj.getSquare());
        }
    }
}
