package org.example.model;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_home_03 {

    public static void main(String[] args) {
        //Дана последовательность N целых чисел. Найти сумму простых чисел.
        int a, sum=0, n;
        System.out.println("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Введите последовательность: ");
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            BigInteger bigInteger = BigInteger.valueOf(a);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(a));
            if (probablePrime) {
                sum+=a;
            }
        }
        System.out.println("Сумма простых чисел = " +sum);
        scanner.close();
    }

}
