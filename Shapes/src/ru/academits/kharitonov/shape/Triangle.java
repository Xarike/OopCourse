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

    @Override
    public String toString() {
        return String.format("Площадь = %.1f, Периметр = %.1f", getArea(), getPerimeter());
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return x1 == triangle.x1 && y1 == triangle.y1 && x2 == triangle.x2 && y2 == triangle.y2 && x3 == triangle.x3 && y3 == triangle.y3;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(x1);
        hash = prime * hash + Double.hashCode(y1);
        hash = prime * hash + Double.hashCode(x2);
        hash = prime * hash + Double.hashCode(y2);
        hash = prime * hash + Double.hashCode(x3);
        hash = prime * hash + Double.hashCode(y3);
        return hash;
    }
}