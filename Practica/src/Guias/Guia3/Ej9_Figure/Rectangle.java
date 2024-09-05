package Guias.Guia3.Ej9_Figure;

import Guias.Guia3.EJ3.Point;
public class Rectangle extends Figure{
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point tL, Point bR) {
        this.topLeft = tL;
        this.bottomRight = bR;
    }

    public double base(){
        return Math.abs(this.bottomRight.getX() - this.topLeft.getX());
    }

    public double height() {
        return Math.abs(this.topLeft.getY() - this.bottomRight.getY());
    }

    @Override
    public double area() {
        return base() * height();
    }

    @Override
    public double perimeter() {
        return 2 * base() + 2 * height();
    }

    @Override
    public String toString() {
        return "Rectangle [ %s , %s ]".formatted(topLeft, bottomRight);
    }
}
