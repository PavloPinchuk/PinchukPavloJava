package com.univ;

import java.util.Scanner;

public class Task_Strings_1_27 {
    public static void main(){
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        String s = "";
        for(int i = 0; i < s1.length(); i++)
        {
            if(s2.indexOf(s1.charAt(i)) < 0)
                s += s1.charAt(i);
        }
        System.out.println(s);
        for(int i = 0; i < s2.length(); i++)
        {
            if(s1.indexOf(s2.charAt(i)) < 0)
                s += s2.charAt(i);
        }
        System.out.println(s);
    }
}
