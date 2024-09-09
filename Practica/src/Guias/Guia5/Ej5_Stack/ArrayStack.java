package Guias.Guia5.Ej5_Stack;

import java.util.Arrays;

public class ArrayStack<E> implements Stack<E>{

    private E[] elements;
    private static final int INITIAL_DIM = 10;
    private int dim;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        elements = (E[]) new Object[INITIAL_DIM];
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }

    @Override
    public void push(E elem) {
        if (dim == elements.length) {
            resize();
        }
        elements[dim++] = elem;
    }

    @Override
    public E peek() {
        return elements[dim-1];
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyArrayException();
        }
        return elements[--dim];
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = dim-1; i >= 0; i--) {
            str.append(elements[i]).append(",");
        }
        str.setCharAt(str.length() - 1, ']');
        return str.toString();
    }

    public int getDim() {
        return dim;
    }
}
