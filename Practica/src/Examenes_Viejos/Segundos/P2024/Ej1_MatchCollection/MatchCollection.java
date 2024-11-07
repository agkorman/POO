package Examenes_Viejos.Segundos.P2024.Ej1_MatchCollection;

import java.util.List;
import java.util.SortedSet;
import java.util.function.Predicate;

// que mi interfaz extienda a la interfaz de la colección es necesario
public interface MatchCollection<E> extends List<E> {
    void addMatchPredicate(Predicate<E> pred);
    SortedSet<E> getAllMatched();
    SortedSet<E> getAllMatchedReversed();
}
