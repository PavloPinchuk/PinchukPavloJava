/*
3 курс, комп'ютерна математика 1, Пінчук Павло
Проект №4 - Поліном
 */

package com.univ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Ввести дані з консолі {0}, чи з тестового файлу {1}?");
        int choice = Integer.parseInt(s.nextLine());

        Polynom<Rational> polinom;
        //Якщо консоль
        if (choice == 0){
            System.out.println("Коефіцієнт при x: ");
            double a = Double.parseDouble(s.nextLine());
            System.out.println("ільний коефіцієнт: ");
            double b = Double.parseDouble(s.nextLine());
            polinom = new Polynom<>(new Rational(a), new Rational(b));
        }
        //Якщо файл
        else {
            //file
            System.out.println("Введіть абсолютний шлях до файлу: ");
            String path = s.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(path));
            double[] values = Arrays.stream(br.readLine().split(" "))
                    .mapToDouble(Double::valueOf).toArray();

            polinom = new Polynom<>(new Rational(values[0]),
                    new Rational(values[1]));
        }

        System.out.printf("Поліном: %fx + %f\n", polinom.getFirstPow().doubleValue(),
                polinom.getZeroPow().doubleValue());

        System.out.println("Рішення лінійного рівняння: ax + b = 0 => \nx = " +
                polinom.getLinearEquationResult(new Rational(0)));

        System.out.println("Решение квадратного уравнения: ax2 + bх + с = 0 => \n" +
                polinom.quadraticEquation(new Rational(0)));

        System.out.println("Значення полінома в точці x = 1: " + polinom.getPolynomValue(1));

        System.out.println("Похідна: " + polinom.getDerivative().doubleValue());

        System.out.println("Визначений інтеграл від 0 до 10: " + polinom.defIntegral(0, 10));




    }
}
