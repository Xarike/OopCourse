package ru.academits.kharitonov.shape;

import java.util.Comparator;

public class SortByShapePerimeter implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        if (shape1.getArea() > shape2.getArea()) {
            return 1;
        }
        if (shape1.getPerimeter() < shape2.getPerimeter()) {
            return -1;
        }

        return 0;
    }
}