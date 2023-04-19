package ru.academits.kharitonov.vector_main;

import ru.academits.kharitonov.vector.Vector;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(5);
        v1.array = new double[]{5.5, 1.1, 2.2, 3.4, 4.5};
        System.out.println("Конструктор 1 - " + Arrays.toString(v1.array));

        Vector v2 = new Vector(v1);
        System.out.println("Конструктор 2 - " + Arrays.toString(v2.array));

        double[] array = {4.1, 3.4, 5.9};
        Vector v3 = new Vector(array);
        System.out.println("Конструктор 3 - " + Arrays.toString(v3.array));

        double[] array1 = {2.3, 4.3, 5.0};
        Vector v4 = new Vector(2, array1);
        System.out.println("Конструктор 4 - " + Arrays.toString(v4.array));

        int lengthV3 = v3.getSize();
        System.out.println("Размерность вектора - " + lengthV3);

        System.out.println(v1);
        System.out.println(v3);

        Vector v5 = Vector.summation(v3, v1);
        System.out.println("Сумма векторов - " + v5);

        Vector v6 = Vector.difference(v1, v3);
        System.out.println("Разность векторов - " + v6);

        double v7 = Vector.scalar(v1, v3);
        System.out.println("Скалярное произведение векторов" + v7);

        v1.getSummation1(v1, v3);
        System.out.println("Сумма векторов не статик - " + v1);

        System.out.println(v1);
        System.out.println(v3);

        v1.getDifference1(v1, v3);
        System.out.println("Сумма векторов не статик - " + v1);

        System.out.println(v1);
        System.out.println(v7);

        v1.getScalar(v1, v7);
        System.out.println("Сумма векторов не статик - " + v1);

        System.out.println(v1);

        v1.getReverseVector(v1);
        System.out.println("Сумма векторов не статик - " + v1);

        double m = v3.getLength(v3);
        System.out.println(m);

        System.out.println(v3);
        System.out.println(v3.getIndex(v3, 1));

        System.out.println(v3.replacementIndex(v3, 1, 11.1));
    }
}