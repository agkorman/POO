package Clase.MisteryCollection;

import java.util.*;
import java.util.function.Predicate;

public class MysteryCollectionImpl<T extends Comparable<? super T>> extends
        ArrayList<T> implements MysteryCollection<T> {

    @Override
    public SortedMap<T, Integer> toSortedBag() {
        return toSortedBag(x -> true);
    }

    @Override
    public SortedMap<T, Integer> toSortedBag(Predicate<T> condition) {
        SortedMap<T, Integer> toReturn = new TreeMap<>();
        for (T elem : this) {
            if (condition.test(elem)) {
                // un equivalente:
                // toRetrun.merge(elem, 1, (0, n) -> o + n)
                if (!toReturn.containsKey(elem)) {
                    toReturn.put(elem, 0);
                }
                int current = toReturn.get(elem);
                toReturn.put(elem, ++current);
            }
        }
        return toReturn;
    }


}
