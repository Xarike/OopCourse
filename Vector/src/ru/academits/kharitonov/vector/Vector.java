package ru.academits.kharitonov.vector;

import java.util.Arrays;

public class Vector {

    public double[] array;

    public Vector(int n) { // конструктор размерность n, все компоненты равны 0
        array = new double[n];
    }

    public Vector(Vector v1) { // конструктор копирования
        array = new double[v1.array.length];
        System.arraycopy(v1.array, 0, array, 0, v1.array.length);
    }

    public Vector(double[] array1) { // конструктор заполнение вектора значениями из массива
        array = new double[array1.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
    }

    public Vector(int n, double[] array1) { // Конструктор заполнение вектора значениями из массива. Если длина массива меньше n, то считать что в остальных компонентах 0
        array = new double[n];
        if (n < array1.length) {
            System.arraycopy(array1, 0, array, 0, n);
        } else {
            System.arraycopy(array1, 0, array, 0, array1.length);
            for (int i = array1.length; i < n; i++) {
                array[i] = 0;

            }
        }
    }

    public int getSize() { // Конструктор для получения размерности вектора
        return array.length;
    }

    @Override
    public String toString() {
        String[] arrayString = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayString[i] = String.valueOf(array[i]);
        }
        return Arrays.toString(arrayString);
    }

    public static Vector summation(Vector v1, Vector v2) { // метод прибавление к вектору другого вектора
        Vector v3;

        if (v1.array.length >= v2.array.length) {
            v3 = new Vector(v1.array.length);

            for (int i = 0; i < v1.array.length; i++) {
                if (i < v2.array.length) {
                    v3.array[i] = v1.array[i] + v2.array[i];
                } else {
                    v3.array[i] = v1.array[i];
                }
            }

            return v3;
        }

        v3 = new Vector(v2.array.length);

        for (int i = 0; i < v2.array.length; i++) {
            if (i < v1.array.length) {
                v3.array[i] = v1.array[i] + v2.array[i];
            } else {
                v3.array[i] = v2.array[i];
            }
        }

        return v3;
    }

    public static Vector difference(Vector v1, Vector v2) {  // метод вычитание из вектора другого вектора
        Vector v3;

        if (v1.array.length >= v2.array.length) {
            v3 = new Vector(v1.array.length);

            for (int i = 0; i < v1.array.length; i++) {
                if (i < v2.array.length) {
                    v3.array[i] = v1.array[i] - v2.array[i];
                } else {
                    v3.array[i] = v1.array[i];
                }
            }

            return v3;
        }

        v3 = new Vector(v2.array.length);

        for (int i = 0; i < v2.array.length; i++) {
            if (i < v1.array.length) {
                v3.array[i] = v1.array[i] - v2.array[i];
            } else {
                v3.array[i] = v2.array[i];
            }
        }

        return v3;
    }

    public static double scalar(Vector v1, Vector v2) { // метод умножение вектора на скаляр
        double scalar = 0;

        if (v1.array.length <= v2.array.length) {
            for (int i = 0; i < v1.array.length; i++) {
                scalar += v1.array[i] * v2.array[i];
            }

            return scalar;
        }

        for (int i = 0; i < v2.array.length; i++) {
            scalar += v1.array[i] * v2.array[i];
        }

        return scalar;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Vector vector1 = (Vector) o;
        return Arrays.equals(vector1.array, array);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Arrays.hashCode(array);
        return hash;
    }

    public Vector getSummation1(Vector v1, Vector v2) {
        if (v1.array.length >= v2.array.length) {
            for (int i = 0; i < v1.array.length; i++) {
                if (i < v2.array.length) {
                    v1.array[i] = v1.array[i] + v2.array[i];
                }
            }

            return v1;
        }

        for (int i = 0; i < v2.array.length; i++) {
            if (i < v1.array.length) {
                v2.array[i] = v1.array[i] + v2.array[i];
            }
        }

        return v2;
    }

    public Vector getDifference1(Vector v1, Vector v2) {
        if (v1.array.length >= v2.array.length) {
            for (int i = 0; i < v1.array.length; i++) {
                if (i < v2.array.length) {
                    v1.array[i] = v1.array[i] - v2.array[i];
                }
            }

            return v1;
        }

        for (int i = 0; i < v2.array.length; i++) {
            if (i < v1.array.length) {
                v2.array[i] = v1.array[i] - v2.array[i];
            }
        }

        return v2;
    }

    public Vector getScalar(Vector v1, double scalar) { // метод умножение вектора на скаляр

            for (int i = 0; i < v1.array.length; i++) {
                v1.array[i] += v1.array[i] * scalar;
            }

        return v1;
    }

    public Vector getReverseVector(Vector v1) { // метод умножение вектора на скаляр

        for (int i = 0; i < v1.array.length; i++) {
            v1.array[i]= v1.array[i] * (- 1);
        }

        return v1;
    }

    public double getLength(Vector v1){
        double sum = 0;
        for (int i = 0; i < v1.array.length; i++) {
            sum += Math.pow(v1.array[i], 2);
        }

        sum = Math.sqrt(sum);
        return sum;
    }

    public double getIndex(Vector v1, int index){
        double number = 0;

        for (int i = 0; i < v1.array.length; i++) {
            if(i == index){
                number = v1.array[i];
                return number;
            }
        }

        return -1;
    }

    public Vector replacementIndex(Vector v1, int index, double number){
        double temp1 = 0;
        double temp2;

        for (int i = 0; i < v1.array.length; i++) {
            if(index == i){
                temp1 = v1.array[i];
                v1.array[i] = number;
            }

            if (index < i){
                temp2 = v1.array[i];
                v1.array[i] = temp1;
                temp1 = temp2;
            }
        }

        return v1;
    }
}