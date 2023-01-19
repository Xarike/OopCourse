package ru.academits.range_main.kharitonov;

import ru.academits.range.kharitonov.Range;

public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(10.5, 25.5);

        double from = range.getFrom();
        System.out.println("Начало диапазона " + from);

        double to = range.getTo();
        System.out.println("Конец диапазона " + to);

        System.out.println("Длина диапазона равна " + range.getLength());

        boolean isNumberInRange = range.isInside(15.5);

        if (isNumberInRange) {
            System.out.println("Число входит в диапазон!");
        } else {
            System.out.println("Число не входит в диапазон!");
        }

        range.setFrom(11.5);
        from = range.getFrom();
        System.out.println("Начало диапазона " + from);

        range.setTo(30.5);
        to = range.getTo();
        System.out.println("Конец диапазона " + to);

        System.out.println("Длина диапазона равна " + range.getLength());

        isNumberInRange = range.isInside(10.5);

        if (isNumberInRange) {
            System.out.println("Число входит в диапазон!");
        } else {
            System.out.println("Число не входит в диапазон!");
        }
    }
}