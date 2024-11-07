package Examenes_Viejos.Segundos.P2024.Ej1_MatchCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class MatchCollectionImpl<E extends Comparable<? super E>>  extends ArrayList<E> implements MatchCollection<E> {

    private Predicate<E> predicate = elem -> true;

    @Override
    public void addMatchPredicate(Predicate<E> pred) {
        // retorna un nuevo predicado que es la conjunción lógica de ambos predicados
        predicate = predicate.and(pred);
    }

    private SortedSet<E> getAllMatched(Comparator<E> cmp) {
        SortedSet<E> ans = new TreeSet<>(cmp);
        for (E elem : this) {
            if (predicate.test(elem)) {
                ans.add(elem);
            }
        }
        return ans;
    }

    @Override
    public SortedSet<E> getAllMatched() {
      return getAllMatched(Comparator.naturalOrder());
    }

    @Override
    public SortedSet<E> getAllMatchedReversed() {
        return getAllMatched(Comparator.reverseOrder());
    }
}
