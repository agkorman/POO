package Taller.Taller9.Ej3_SpecialCollection;

import java.util.SortedSet;
import java.util.function.Predicate;

// @Importante: extiende a comparable pq me pide orden natural
public interface SpecialCollection<E extends Comparable<? super E>> extends SortedSet<E> {

    void deleteFirst(Predicate<E> predicate);

    default void deleteFirst() {
        deleteFirst(first -> true);
    }

    void undoDeleteFirst();

}

