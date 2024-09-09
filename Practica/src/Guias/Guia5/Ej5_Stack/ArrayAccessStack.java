package Guias.Guia5.Ej5_Stack;

import java.lang.reflect.Array;

public class ArrayAccessStack<E> extends ArrayStack<E> implements AccessStack<E>{

    private int pops;
    private int pushes;

    public ArrayAccessStack() {
        super();
    }

    @Override
    public E pop() {
        pops++;
        return super.pop();
    }

    @Override
    public int getPopAccesses() {
        return pops;
    }

    @Override
    public int getPushAccesses() {
        return getDim() + pops;
    }
}
