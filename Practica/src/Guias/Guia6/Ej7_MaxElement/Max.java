package Guias.Guia6.Ej7_MaxElement;

import java.util.Collection;
import java.util.Comparator;

public class Max<T extends Comparable<? super T>> {

    public T mayor(Collection<T> valores) {
        if(valores.isEmpty()) {
            return null;
        }
        T mayor = null;
        for(T elem : valores) {
            if (mayor == null || mayor.compareTo(elem) < 0) {
                mayor = elem;
            }
        }
        return mayor;
    }
}
