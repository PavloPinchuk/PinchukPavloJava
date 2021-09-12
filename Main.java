package com.univ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 3.27
        double r, h, S1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r: ");
        r = scanner.nextDouble();
        System.out.print("Enter h: ");
        h = scanner.nextDouble();
        S1 = (Math.PI * r * r * h) / 3;
        System.out.println("Square of konus: " + S1);
        //Task 4.5
        double x1, x2, x3, y1, y2, y3;
        System.out.print("Enter x1: ");
        x1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        x3 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        y1 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        y2 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        y3 = scanner.nextDouble();
        double A,B,C,p,S2;
        A = Calc(x1,y1,x2,y2);
        B = Calc(x2,y2,x3,y3);
        C = Calc(x3,y3,x1,y1);
        p = (A+B+C)/2;
        S2 = Math.sqrt(p*(p-A)*(p-B)*(p-C));
        System.out.println("Square of triangle: " + S2);
        scanner.close();
    }

    public static double Calc(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }
}
