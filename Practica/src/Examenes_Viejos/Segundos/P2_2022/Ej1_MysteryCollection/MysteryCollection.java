package Examenes_Viejos.Segundos.P2_2022.Ej1_MysteryCollection;


import java.util.List;
import java.util.SortedSet;

public interface MysteryCollection<T extends Comparable<? super T>> extends SortedSet<T> {
    <E extends Comparable<? super E>> List<Pair<T, E>> zip(MysteryCollection<E> mc);
}
