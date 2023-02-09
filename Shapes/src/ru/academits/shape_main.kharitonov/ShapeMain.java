package ru.academits.shape_main.kharitonov;

import ru.academits.shape.kharitonov.Circle;
import ru.academits.shape.kharitonov.Square;
import ru.academits.shape.kharitonov.Triangle;
import ru.academits.shape.kharitonov.Rectangle;

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
    }
}