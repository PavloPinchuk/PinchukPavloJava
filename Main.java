package com.univ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task_1_7();
        Task_1_23();
    }

    public static void Task_1_7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: "); // кількість чисел в масиві
        int n = scanner.nextInt();
        int[] mas = new int[n];
        for(int i = 0; i < n; i++)
        {
            mas[i] = scanner.nextInt();
        }
        int cntEven = 0, cntEqual = 0;
        for (int i = 0; i < n; i++) {
            int t = mas[i];
            boolean f = true;
            while (t > 0) {
                if ((t % 10) % 2 != 0) {
                    f = false;
                    break;
                }
                t /= 10;
            }
            if (f)
                cntEven++;
        }
        System.out.println("Count of even: " + cntEven);
        for (int i = 0; i < n; i++) {
            int t = mas[i];
            int odd = 0, even = 0;
            while (t > 0) {
                if ((t % 10) % 2 == 0)
                    even++;
                else
                    odd++;
                t /= 10;
            }
            if (odd == even)
                cntEqual++;
        }
        System.out.println("Count of equal: " + cntEqual);
    }

    public static void Task_1_23(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), sum = 0;
        for(int i = 2; i < 11; i++)
        {
            sum += n%10 *i;
            n/=10;
        }
        System.out.println("Контрольна цифра: " + (11 - sum%11));
    }
}
