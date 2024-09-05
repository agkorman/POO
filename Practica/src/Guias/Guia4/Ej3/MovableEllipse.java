package Guias.Guia4.Ej3;

import Guias.Guia3.Ej9_Figure.Ellipse;
import Guias.Guia3.EJ3.Point;

public class MovableEllipse extends Ellipse implements Movable{

    private final MovablePoint centerPoint;

    public MovableEllipse(MovablePoint centerPoint, double bigAxis, double smallAxis) {
        super(centerPoint, bigAxis, smallAxis);
        this.centerPoint = centerPoint;
    }

    @Override
    public void moveNorth(double delta) {
        ((MovablePoint)centerPoint).moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta) {
        ((MovablePoint)centerPoint).moveSouth(delta);
    }

    @Override
    public void moveWest(double delta) {
        ((MovablePoint)centerPoint).moveWest(delta);
    }

    @Override
    public void moveEast(double delta) {
        ((MovablePoint)centerPoint).moveEast(delta);
    }

}
