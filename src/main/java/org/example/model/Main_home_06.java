package org.example.model;

import java.util.Scanner;

public class Main_home_06 {
    public static void main(String[] args) {
        // Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива

        int sum = 0;
        System.out.println("Введите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int i = 0; i<n; i++) {
            if ((mass[i] < 100) && (mass[i] > 9) || (mass[i] > -100) && (mass[i] < -9)) {
                sum += i ;

            }
            //System.out.println(" "+sum);

                for (i = 0; i<n; i++) {
                    if (mass[i] < 0) {
                        mass[i] = sum;
                    }
                    System.out.println(" " + mass[i]);
                }
        }
//        System.out.println("Сумма элементов, у которых последняя и предпоследняя цифры равны составляетЖ " + sum);

    }


}
