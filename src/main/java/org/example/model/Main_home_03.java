package org.example.model;

import java.util.Scanner;

public class Main_home_03 {

    public static void main(String[] args) {
        //Дана последовательность N целых чисел. Найти сумму простых чисел.
        int a, b, sum=0, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            //b = scanner.nextInt();
            if ((a > 0) && (a % 2 == 0)) {
                sum+=a;
            }
            //a=b;

        }
        System.out.println("sum= " +sum);
        scanner.close();
    }

}
