package ru.academits.kharitonov.shape_main;

import ru.academits.kharitonov.shape.Circle;
import ru.academits.kharitonov.shape.Rectangle;
import ru.academits.kharitonov.shape.Shape;
import ru.academits.kharitonov.shape.Square;
import ru.academits.kharitonov.shape.Triangle;

public class ShapeMain {
    public static void main(String[] args) {
        Square square = new Square(3.5);
        System.out.println(square.getWidth() + ", " + square.getHeight() + ", " + square.getArea() + ", " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(15,10);
        System.out.println(rectangle.getWidth() + ", " + rectangle.getHeight() + ", " + rectangle.getArea() + ", " + rectangle.getPerimeter());

        Circle circle = new Circle(4);
        System.out.println(circle.getWidth() + ", " + circle.getHeight() + ", " + circle.getArea() + ", " + circle.getPerimeter());

        Triangle triangle = new Triangle( 3, 5 ,1, 9, 2, 4);
        System.out.println(triangle.getWidth() + ", " + triangle.getHeight() + ", " + triangle.getArea() + ", " + triangle.getPerimeter());

        Shape[] arreyShape = new Shape[8];
        arreyShape[0] = new Circle(7.0);
        arreyShape[1] = new Triangle(5, 2, 9, 3, 8, 5);
        arreyShape[2] = new Square(6);
        arreyShape[3] = new Rectangle(4, 3.5);
        arreyShape[4] = new Square(6);
        arreyShape[5] = new Rectangle(7,6);
        arreyShape[6] = new Circle(9.5);
        arreyShape[7] = new Triangle(3, 10 ,1, 9, 2, 3);


    }
}