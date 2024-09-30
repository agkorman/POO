package Examenes_Viejos.Primeros.Repaso.Ej2_parallelIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>>{

    private T[] col1, col2;
    private int dim1, dim2, idx;

    public ParallelIterator(T[] col1, T[] col2) {
        if (col1 == null) {
            throw new RuntimeException("First collection missing");
        } else if (col2 == null) {
            throw new RuntimeException("Second collection missing");
        }
        this.col1 = col1;
        dim1 = col1.length;
        this.col2 = col2;
        dim2 = col2.length;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < dim1 && idx < dim2;
    }


    @Override
    public Pair<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Pair<T> toReturn = new Pair<>(col1[idx], col2[idx++]);
        return toReturn;
    }

    public static class Pair<E> {
        private final E left, right;

        Pair(E left, E right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "{%s, %s}".formatted(left, right);
        }

    }

}
