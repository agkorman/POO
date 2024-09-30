package Guias.Guia5.Ej14_ReversedIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedIterator<E> implements Iterator<E> {

    private final E[] array;
    private int idx;

    public ReversedIterator(E[] array) {
        this.array = array;
        idx = array.length;
    }

    @Override
    public boolean hasNext() {
        return idx >= 0;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[idx--];
    }

}
