package Guias.Guia6.Ej3_CyclicIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<T> implements Iterator<PairCyclicIterator.Pair<T>>{

    private final Iterable<T> collection;
    private Iterator<T> iterator;

    public PairCyclicIterator(Iterable<T> collection) {
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T l , r;
        if (!iterator.hasNext()) {
            iterator = collection.iterator();
        }
        l = iterator.next();
        if (!iterator.hasNext()) {
            iterator = collection.iterator();
        }
        r = iterator.next();
        return new Pair<T>(l, r);
    }

    public static class Pair<E> {
        private E r, l;

        public Pair(E l, E r) {
            this.r = r;
            this.l = l;
        }

        @Override
        public String toString() {
            return "[%s, %s]".formatted(l, r);
        }
    }
}
