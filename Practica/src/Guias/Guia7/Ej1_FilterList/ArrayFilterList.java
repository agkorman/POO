package Guias.Guia7.Ej1_FilterList;

import java.util.ArrayList;

public class ArrayFilterList<E> extends ArrayList<E> implements FilterList<E>{

    @Override
    public FilterList<E> filter(Criteria<E> criteria) {
        ArrayFilterList<E> ans = new ArrayFilterList<>();
        for (E elem : this) {
            if (criteria.satisfice(elem)) ans.add(elem);
        }
        return ans;
    }
}
