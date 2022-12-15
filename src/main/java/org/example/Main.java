package org.example;

import java.util.Scanner;

public class Main {
    /**
     */

    public static void main(String[] args) {
        //Реализовать pow(x, n), который вычисляет x возведенный в степень n(т.е. xn).
        double x;
        int n;
        double result;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        scanner.close();
        result = x;
        for (int i = 1; i < n; i++) {
            result *=x;
        }
        System.out.println("result " + result);

    }
}