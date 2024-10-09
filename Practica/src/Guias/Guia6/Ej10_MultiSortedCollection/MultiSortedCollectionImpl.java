package Guias.Guia6.Ej10_MultiSortedCollection;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T>{

    private Map<Comparator<T>, Set<T>> mss = new HashMap<>();


    @Override
    public void add(Comparator<T> comp) {
        mss.put(comp, new TreeSet<>(comp));
    }

    @Override
    public void add(T elem) {
        if (mss.isEmpty()) {
            throw new IllegalStateException();
        }
        for(Set<T> set : mss.values()) {
            set.add(elem);
        }
    }

    @Override
    public void remove(T elem) {
        for(Set<T> set : mss.values()) {
            set.remove(elem);
        }
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        if(!mss.containsKey(comp)) {
            throw new IllegalStateException();
        }
        return mss.get(comp);
    }
}
