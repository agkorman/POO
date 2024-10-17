package Taller.Taller9.Ej3_SpecialCollection;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SpecialCollectionImpl<E extends Comparable<? super E>> extends TreeSet<E> implements SpecialCollection<E> {

    private final Deque<E> deleted = new LinkedList<>();

    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    public void deleteFirst(Predicate<E> predicate) {
        E first = getFirst();
        if(predicate.test(first)) {
            remove(first);
            deleted.push(first);
        }
    }

    @Override
    public void undoDeleteFirst() {
        if(deleted.isEmpty()) {
            throw new NothingToUndoException();
        }
        add(deleted.pop());
    }

}

