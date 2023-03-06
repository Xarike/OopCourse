package ru.academits.kharitonov.shape_main;

import ru.academits.kharitonov.shape.*;

import java.util.Arrays;


public class ShapeMain {
    public static void main(String[] args) {
        Shape[] arreyShape = {
                new Circle(7.0),
                new Triangle(5, 2, 9, 3, 8, 5),
                new Square(6),
                new Rectangle(4, 3.5),
                new Square(6),
                new Rectangle(7, 6),
                new Circle(9.5),
                new Triangle(3, 10, 1, 9, 2, 3)
        };

        Arrays.sort(arreyShape, new SortByShapeArea());
        System.out.println("Первая площадь по величине = " + Arrays.toString(new Shape[]{arreyShape[arreyShape.length - 1]}));

        Arrays.sort(arreyShape, new SortByShapePerimeter());
        System.out.println("Второй периметр по величине = " + Arrays.toString(new Shape[]{arreyShape[arreyShape.length - 2]}));
    }
}