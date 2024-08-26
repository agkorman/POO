package Guias.Guia3.Ej9;

import Guias.Guia3.EJ3.Point;
public class Ellipse extends Figure{
    protected Point centerPoint;
    protected double sMayorAxis, sMinorAxis;

    public Ellipse(Point cP, double sMaA, double sMiA) {
        this.centerPoint = cP;
        this.sMayorAxis = sMaA;
        this.sMinorAxis = sMiA;
    }

    @Override
    public double area() {
        return Math.PI / 4 * sMayorAxis * sMinorAxis;
    }

    @Override
    public double perimeter() {
        return Math.PI / 2 * (sMayorAxis + sMinorAxis);
    }

    @Override
    public String toString() {
        return "Ellipse [Center: %s, MayorA: %.2f, DMenor: %.2f]".formatted(centerPoint, sMayorAxis, sMinorAxis);
    }

}
