package com.univ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        double garm = 2.0/(1.0/a + 1.0/b);
        int roz_a = 0, roz_b = 0;
        while (a>0)
        {
            roz_a++;
            a/=10;
        }
        while (b>0)
        {
            roz_b++;
            b/=10;
        }
        System.out.println("Rozriad of a: " + roz_a);
        System.out.println("Rozriad of b: " + roz_b);
        System.out.println("Seredne garmonichne: " + garm);
        scanner.close();
    }
}
