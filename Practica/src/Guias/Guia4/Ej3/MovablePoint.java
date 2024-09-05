package Guias.Guia4.Ej3;

import Guias.Guia3.EJ3.Point;

public class MovablePoint extends Point implements Movable{

    double x,y;

    public MovablePoint(double x, double y) {
        super(x, y);
    }


    @Override
    public void moveNorth(double delta) {
        y += delta;
    }

    @Override
    public void moveSouth(double delta) {
        y -= delta;
    }

    @Override
    public void moveWest(double delta) {
        x -= delta;
    }

    @Override
    public void moveEast(double delta) {
        x += delta;
    }


}
