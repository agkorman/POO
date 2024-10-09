package Taller.Taller8.Ej1_mapperV1;

import java.util.List;

public interface SimpleList<E> extends List<E> {

    <T> SimpleList<T> map(Mapper<E, T> mapper);

}
