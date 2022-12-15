package org.example.model;

import java.util.Scanner;

public class Main_home_02 {

    public static void main(String[] args) {
        //⦁	Дана последовательность целых чисел, оканчивающаяся нулем.
        // Найти сумму положительных чисел, после которых следует отрицательное число.
        int a, b, sum=0, n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность: ");
        a = scanner.nextInt();
        while (a != 0) {
            b = scanner.nextInt();
            if ((b < 0) && (a > 0)) {
                sum+=a;
            }
           a=b;

        }
        System.out.println("Количество чисел= " +sum);
        scanner.close();

    }

}
