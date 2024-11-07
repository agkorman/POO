package Examenes_Viejos.Segundos.P2_2022.Ej1_MysteryCollection;

import java.util.*;

public class MysteryCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T>
        implements MysteryCollection<T> {

    public MysteryCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    @Override
    public <E extends Comparable<? super E>> List<Pair<T, E>> zip(MysteryCollection<E> mc) {
        List<Pair<T, E>> ans = new ArrayList<>();
        Iterator<T> thisIt = this.iterator();
        Iterator<E> thatIt = mc.iterator();
        while (thisIt.hasNext() && thatIt.hasNext()) {
            ans.add(new Pair<>(thisIt.next(), thatIt.next()));
        }
        return ans;
    }
}
