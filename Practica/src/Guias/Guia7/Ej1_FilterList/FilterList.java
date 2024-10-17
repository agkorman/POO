package Guias.Guia7.Ej1_FilterList;

import java.util.List;

public interface FilterList<E> extends List<E> {
    FilterList<E> filter(Criteria<E> criteria);
}
