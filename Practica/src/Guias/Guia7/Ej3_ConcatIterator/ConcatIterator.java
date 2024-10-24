package Guias.Guia7.Ej3_ConcatIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<E> implements Iterator<E> {

    private Iterator<E> it1, it2;
    public ConcatIterator(Iterator<E> it1, Iterator<E> it2) {
        this.it1 = it1;
        this.it2 = it2;
    }

    private boolean flag = false;

    @Override
    public boolean hasNext() {
        if (it1.hasNext()) {
            return it1.hasNext();
        }
        flag = true;
        return it2.hasNext();
    }
    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return flag ? it2.next() : it1.next();
    }
}
