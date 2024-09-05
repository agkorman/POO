package Taller.Taller4;

import java.util.Arrays;

public class ArrayList <T> implements List<T> {
    private T[] arr;
    private int dim;
    private final int DEFAULT_SIZE = 10;

    public ArrayList() {
        arr = (T[]) new Object[DEFAULT_SIZE];
        dim = 0;
    }
    @Override
    public void add(T elem) {
        if (dim == arr.length) {
            resize();
        }
        arr[dim++] = elem;
    }

    @Override
    public boolean remove(int position) {
        if (position < 0 || position > dim) {
            return false;
        }
        arr[position] = arr[--dim];
        return true;
    }

    @Override
    public int indexOf(T elem) {
        for (int i = 0; i < dim; i++) {
            if (arr[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    private void resize() {
        arr = Arrays.copyOf(arr, arr.length * DEFAULT_SIZE);
    }
}
