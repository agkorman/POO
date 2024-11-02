package Examenes_Viejos.Segundos.Repaso.Ej2_ReversedList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

// esta solución cumple con el tester pero solo pq es con Integer

public class ReversedListImpl<T> extends ArrayList<T> implements ReversedList<T>{

    public Iterator<T> defaultIterator() {
        return super.iterator();
    }

    @Override
    public Iterator<T> iterator() {
        return new ReversedIterator();
    }

    private class ReversedIterator implements Iterator<T> {
        private int current;

        @Override
        public boolean hasNext() {
            return current < size();
        }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            current++;
            return get(size() - current);
        }
    }
}