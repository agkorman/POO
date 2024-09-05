package Guias.Guia3.Ej9_Figure;

import Guias.Guia3.EJ3.Point;

public class Triangle extends Figure{
    private Point firstPoint, secondPoint, thirdPoint;
    private double a, b, c;

    public Triangle(Point first, Point second, Point third) {
        this.firstPoint = first;
        this.secondPoint = second;
        this.thirdPoint = third;
        a = firstPoint.distanceTo(secondPoint);
        b = secondPoint.distanceTo(thirdPoint);
        c = thirdPoint.distanceTo((firstPoint));
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }

    private double firstSide() {
        return a;
    }

    private double seconSide() {
        return b;
    }

    private double thirdSide() {
        return c;
    }

    @Override
    public String toString() {
        return "Triangle = [ %s, %s, %s ]".formatted(firstPoint.toString(), secondPoint.toString(), thirdPoint.toString());
    }
}
