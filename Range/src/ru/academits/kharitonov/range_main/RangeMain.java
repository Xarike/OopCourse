package ru.academits.kharitonov.range_main;

import ru.academits.kharitonov.rande.Range;

import java.util.Arrays;

public class RangeMain {
    public static void main(String[] args) {
        Range range1 = new Range(10.5, 25.5);

        double from = range1.getFrom();
        System.out.println("Начало диапазона " + from);

        double to = range1.getTo();
        System.out.println("Конец диапазона " + to);

        System.out.println("Длина диапазона равна " + range1.getLength());

        boolean isNumberInRange = range1.isInside(15.5);

        if (isNumberInRange) {
            System.out.println("Число входит в диапазон!");
        } else {
            System.out.println("Число не входит в диапазон!");
        }

        range1.setFrom(11.5);
        from = range1.getFrom();
        System.out.println("Начало диапазона " + from);

        range1.setTo(30.5);
        to = range1.getTo();
        System.out.println("Конец диапазона " + to);

        System.out.println("Длина диапазона равна " + range1.getLength());

        isNumberInRange = range1.isInside(10.5);

        if (isNumberInRange) {
            System.out.println("Число входит в диапазон!");
        } else {
            System.out.println("Число не входит в диапазон!");
        }

        Range range2 = new Range(30, 45);

        if (range1.getIntersection(range2) == null) {
            System.out.println("Нет пересечений интервалов!");
        } else {
            System.out.println("Интервал пересечения " + range1.getIntersection(range2));
        }

        System.out.println("Интервал объединения " + Arrays.toString(range1.getUnion(range2)));
        System.out.println("Интервал разности " + Arrays.toString(range1.getDifference(range2)));
    }
}