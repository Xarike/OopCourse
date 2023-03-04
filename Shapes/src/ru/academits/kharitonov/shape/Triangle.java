package ru.academits.kharitonov.shape;

public class Triangle implements Shape {
    double x1;
    double x2;
    double x3;
    double y1;
    double y2;
    double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        if (x1 >= x3 && x3 >= x2) {
            return x1 - x2;
        } else if (x1 > x2 && x2 > x3) {
            return x1 - x3;
        } else if (x2 > x3 && x3 > x1) {
            return x2 - x1;
        } else if (x2 > x1 && x1 > x3) {
            return x2 - x3;
        } else if (x3 > x1 && x1 > x2) {
            return x3 - x2;
        }

        return x3 - x1;
    }

    @Override
    public double getHeight() {
        if (y1 >= y3 && y3 >= 2) {
            return y1 - y2;
        } else if (y1 > y2 && y2 > y3) {
            return y1 - y3;
        } else if (y2 > y3 && y3 > y1) {
            return y2 - x1;
        } else if (y2 > y1 && y1 > y3) {
            return y2 - y3;
        } else if (y3 > y1 && y1 > y2) {
            return y3 - y2;
        }

        return y3 - y1;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)) + Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    }
}