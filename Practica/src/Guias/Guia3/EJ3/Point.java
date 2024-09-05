package Guias.Guia3.EJ3;

public class Point {
    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }
    @Override
    public boolean equals(Object ob) {
        return ob instanceof Point p && this.x == p.x && this.y == p.y;
    }

    @Override
    public String toString() {
        return "{%g, %g}".formatted(x, y);
    }

    public double distanceTo(Point p) {
        double xSquared = Math.pow(this.x + p.x, 2);
        double ySquared = Math.pow(this.y + p.y, 2);
        return Math.sqrt(xSquared + ySquared);
    }
}
