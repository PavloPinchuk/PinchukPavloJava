package com.univ;

import java.util.Scanner;

public class Task_Strings_2_14 {
    public static void main(){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.replaceAll("^ +| +$|( )+", "$1");

        //1
        String[] words = s.split(" ");
        System.out.println();
        System.out.println("Words count: " + words.length);

        //2
        int cnt = 0;
        for (String word: words
             ) {
            if(Character.isDigit(word.charAt(0)))
            {
                cnt++;
                System.out.print(word + " ");
            }
        }
        System.out.println("Count: " + cnt);

        //3
        cnt = 0;
        for (String word: words
        ) {
            if(Character.isDigit(word.charAt(word.length() - 1))
            && Character.isDigit(word.charAt(word.length() - 2))
            && Character.isDigit(word.charAt(word.length() - 3)))
            {
                cnt++;
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + cnt);

        //4
        cnt = 0;
        for (String word: words
        ) {
            if(word.charAt(0) == word.charAt(word.length()-1))
            {
                cnt++;
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + cnt);

        //5
        cnt = 0;
        for (String word: words
        ) {
            if(word.indexOf('@') > 0 && word.indexOf('@') < word.length() - 1)
            {
                cnt++;
                System.out.print(word + " ");
            }
        }
        System.out.println();
        System.out.println("Count: " + cnt);
    }
}
