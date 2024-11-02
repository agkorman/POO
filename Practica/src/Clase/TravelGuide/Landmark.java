package Clase.TravelGuide;

import java.util.Comparator;

public class Landmark implements Comparable<Landmark> {
    private final String name;
    private final double score;

    public Landmark(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "%s # %f #".formatted(name, score);
    }

    @Override
    public int compareTo(Landmark that) {
        int cmp = Double.compare(that.score, this.score);
        if (cmp == 0) {
            cmp = name.compareTo(that.name);
        }
        return cmp;
    }
}
