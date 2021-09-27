package com.univ;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Task_4_7();
        Task_4_20_e();
    }

    public static void Task_4_7()
    {
        int cnt = 0, a, b, c;
        //У мене числа будуть розподілені не від 0 до 1, а від 0 до 100
        Random rand = new Random();
        for(int i = 0; i < 100; i++)
        {
            a = 1 + rand.nextInt(99);
            b = 1 + rand.nextInt(100 - a);
            c = 100 - a - b;
            if(a+b>c && b+c>a && c+a>b && (a*a+b*b)>=c*c && (a*a+c*c)>=b*b && (c*c+b*b)>=a*a)
                cnt++;
        }
        System.out.println(cnt + "/100");
    }

    public static void Task_4_20_e()
    {
        int i = 1, j = 1;
        long k = 1;
        double x, ans = 0, tmp = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        while (true) {
            tmp = (Math.pow(x, i) * j) / k;
            if (Math.abs(tmp) > 0.001) {
                ans += tmp;
                j *= -1;
                k *= (i + 1);
                i += 1;
                //System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                continue;
            }
            System.out.println(ans);
            break;
        }
    }
}
