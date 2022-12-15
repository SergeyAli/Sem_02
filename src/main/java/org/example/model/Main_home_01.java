package org.example.model;

import java.util.Scanner;

public class Main_home_01 {

    public static void main(String[] args) {
        //⦁	Дана последовательность N целых чисел. Найти количество положительных чисел,
        // после которых следует отрицательное число.
        int a, b, sum=0, n;

        System.out.println("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Введите последовательность: ");
        a = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            b = scanner.nextInt();
            if ((b < 0) && (a > 0)) {
                sum+=i;
            }
            a=b;

        }
        System.out.println("Количество чисел= " +sum);
        scanner.close();
    }




}
