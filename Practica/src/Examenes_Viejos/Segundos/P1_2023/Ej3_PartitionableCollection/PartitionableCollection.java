package Examenes_Viejos.Segundos.P1_2023.Ej3_PartitionableCollection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableCollection<E> extends ArrayList<E> {

    public PartitionableCollection<E> getSelected(Predicate<E> pred) {
        PartitionableCollection<E> ans = new PartitionableCollection<>();
        for (E elem : this) {
            if (pred.test(elem)) {
                ans.add(elem);
            }
        }
        return ans;
    }

    public PartitionableCollection<E> getRejected(Predicate<E> pred) {
        return getSelected(Predicate.not(pred));
        // return getSelected(pre.negate())
    }
}
