package Guias.Guia5.Ej1_Pair;

import java.util.Objects;

public class Pair<A extends Comparable<? super A>,
        B extends Comparable<? super B>> implements Comparable<Pair<A,B>> {

    public A a;
    public B b;

    public Pair(A x, B y) {
        this.a = x;
        this.b = y;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof Pair<?, ?> pair && a.equals(pair.a) &&
                b.equals(pair.b));
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }


    @Override
    public String toString() {
        return "[%s, %s]".formatted(a, b);
    }

    @Override
    public int compareTo(Pair<A, B> o) {
        int aDiff = a.compareTo(o.a);
        if (aDiff == 0) {
            int bDiff = b.compareTo(o.b);
            return bDiff;
        }
        return aDiff;
    }
}
