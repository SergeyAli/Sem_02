package org.example;

public class Main_2 {
/**
 *Задача на ООП:
 * 1) Проектирование и создание класса, описывающего вектор  (Vector)
 * Задача:
 * * Создайте класс, который описывает вектор (в трёхмерном пространстве).
 * * У него должны быть:
 * * ⦁	конструктор с параметрами в виде списка координат x, y, z
 * ⦁	метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt(): (vectorLength)
 * * ⦁	метод, вычисляющий скалярное произведение: (vectorScat)
 * * ⦁	метод, вычисляющий векторное произведение с другим вектором: (vectorProduct)
 * * ⦁	метод, вычисляющий угол между векторами (или косинус угла): (vectorCos)
 *      косинус угла между векторами равен скалярному произведению векторов,
 *      деленному на произведение модулей (длин) векторов:
 * * ⦁	методы для суммы и разности: (vectorSum)
 *                                   (vectorDiff)
 * ⦁	статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 *          (vectorRandom)
 * Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект"
 *
 */
        public static void main(String[] args) {
            Vector vector1 = new Vector(1, 1, 1);
            Vector vector2 = new Vector(2, 1, 2);
            System.out.println("lenght= "+vector1.vectorLength());
            System.out.println("scal= "+vector1.vectorScal(vector2));
            System.out.println("vectorPr= "+vector1.vectorProduct(vector2));
            System.out.println("Cos= "+vector1.vectorCos(vector2));
            System.out.println("sum= "+vector1.vectorSum(vector2));
            System.out.println("diff= "+vector1.vectorDiff(vector2));



        }





}
