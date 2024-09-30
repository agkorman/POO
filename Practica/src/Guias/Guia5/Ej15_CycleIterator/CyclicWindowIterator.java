package Guias.Guia5.Ej15_CycleIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CyclicWindowIterator<E> implements Iterator<E[]> {

    private E[] array;
    private int N;
    private int idx;

    public CyclicWindowIterator(E[] array, int N) {
        this.array = array;
        this.N = N;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return array != null && array.length > 0 && N > 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E[] next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E[] toReturn =  (E[]) new Object[N];
        int j = idx++;
        idx %= array.length;
        for(int i = 0; i < N; i++) {
            toReturn[i] = array[j++];
            j %= array.length;
        }
        return toReturn;
    }
}
