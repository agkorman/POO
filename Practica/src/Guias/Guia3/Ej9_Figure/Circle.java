package Guias.Guia3.Ej9_Figure;

import Guias.Guia3.EJ3.Point;

public class Circle extends Ellipse{

    public Circle(Point centerPoint, double radius) {
        super(centerPoint, 2 * radius, 2 * radius);
    }

    @Override
    public String toString() {
        return "Circle: [ Center: %s, Radius: %.2f ]".formatted(centerPoint, sMayorAxis / 2);
    }
}
