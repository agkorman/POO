package Clase.Ej_integrador;

public interface Queue<E> extends Iterable<E>{

    void enqueue(E elem);

    E dequeue();

    boolean isEmpty();
}
