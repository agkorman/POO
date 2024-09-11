package Clase.Ej_integrador;

import java.util.Iterator;

public class QueueImpl<E> implements Queue<E>{

    private Node<E> first, last;

    private static class Node<T> {
        T elem;
        Node<T> next;

        public Node(T elem) {
            this.elem = elem;
        }
    }

    @Override
    public void enqueue(E elem) {
        Node<E> newNode = new Node<>(elem);
        if (isEmpty()) {
            first = newNode;
        }
        else {
            last.next = newNode;
        }
        last = newNode;
    }

    @Override
    public E dequeue() {
        E toReturn = first.elem;
        first = first.next;
        return toReturn;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E toReturn = current.elem;
                current = current.next;
                return toReturn;
            }
        };
    }
}
