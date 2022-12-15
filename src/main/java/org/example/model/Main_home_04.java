package org.example.model;

import java.util.Scanner;

public class Main_home_04 {

    public static void main(String[] args) {
        //Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
        int a, b, sum=0, n;

        System.out.println("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Введите последовательность: ");
        a = scanner.nextInt();
        for (int i = 0; i < n-1; i++) {
            b = scanner.nextInt();
            if (a < b) {
                a = b;
            }
            else {
                System.out.println("НЕТ ");
//                break;
            }


        }
        System.out.println("Возрастает ");

        scanner.close();
    }


}
