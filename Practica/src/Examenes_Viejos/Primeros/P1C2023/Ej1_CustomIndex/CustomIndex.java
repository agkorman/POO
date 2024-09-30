package Examenes_Viejos.Primeros.P1C2023.Ej1_CustomIndex;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T> {


    private UnaryOperator<Integer> nextIndex;
    private T[] arr;
    private int from, to;

    public CustomIndex(T[] arr, int from, int to, UnaryOperator<Integer> nextIndex) {
        this.arr = arr;
        this.from = from;
        this.to = to;
        this.nextIndex = nextIndex;
    }

    public void setNextIndex(UnaryOperator<Integer> nextIndex) {
        this.nextIndex = nextIndex;
    }

    @Override public Iterator<T> iterator() {

        return new Iterator<>() {
            private int current = from;
            private final UnaryOperator<Integer> itNextIndex = nextIndex;

            @Override
            public boolean hasNext() {
                return current <= to;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T ans = arr[current];
                current = itNextIndex.apply(current);
                return ans;
            }
        };

    }

}
