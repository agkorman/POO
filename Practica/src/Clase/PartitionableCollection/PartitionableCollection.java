package Clase.PartitionableCollection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PartitionableCollection<E> extends ArrayList<E>{

    public PartitionableCollection getSelected(Predicate<E> condition) {
        PartitionableCollection ans = new PartitionableCollection<>();
        for (E t : this) {
            if (condition.test(t)) {
                ans.add(t);
            }
        }
        return ans;
    }

    public PartitionableCollection getRejected(Predicate<E> condition) {
        return getSelected(condition.negate());
    }


}
