package org.example;

import org.jetbrains.annotations.NotNull;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector() {
    }

    public Vector(double x) {


    }

    public Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return длинна вектора
     */
    public double vectorLength(){

        return Math.sqrt(x*x+y*y+z+z);
    }
    /**
     *
     * @return возвращает скалярное произведение
     */
    public double vectorScal(Vector vector){

        return x* vector.x+y*vector.y+z+vector.z;
    }
    /**
     *
     * @return векторное произведение
     */
    public Vector vectorProduct(Vector vector){
        return new Vector(
                y*vector.z - z*vector.y,
                z*vector.x- x*vector.z,
                x*vector.y- y*vector.x);
    }
    /**
     *
     * @return  cos угла
     */
    public double vectorCos(Vector vector){
        return vectorScal(vector)/(vectorLength()*vector.vectorLength());
    }

    /**
     *
     * @return  суммав векторов
     */

    public Vector vectorSum(@NotNull Vector vector){
        return new Vector(
        x+vector.x,
        y+vector.y,
        z+vector.z);

    }
    /**
     *
     * @return  разность векторов
     */
    public Vector vectorDiff(@NotNull Vector vector){
        return new Vector(
                x-vector.x,
                y-vector.y,
                z-vector.z);


    }

    /**
     *
     * @param n
     * @return
     */
    public static Vector[] vectorsRandom(int n){
        Vector [] mass = new Vector[n];
        for (int i = 1; i<n; i++) {
            mass[i] = new Vector(
                    Math.random(),
                    Math.random(),
                    Math.random());
        }
        return mass;
    }


}
