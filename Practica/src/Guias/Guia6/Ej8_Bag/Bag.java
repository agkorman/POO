package Guias.Guia6.Ej8_Bag;

public interface Bag<T> {

    void add(T elem);

    void remove(T elem);

    int count(T elem);

    boolean contains(T elem);

    int size();

    int sizeDistinct();
}
