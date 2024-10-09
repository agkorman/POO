package Taller.Taller8.Ej2_mapperV2;

import java.util.ArrayList;

public class SimpleArrayList<E> extends ArrayList<E> implements SimpleList<E> {

    @Override
    public <T> SimpleList<T> map(Mapper<E, T> mapper) {
        SimpleList<T> toReturn = new SimpleArrayList<>();
        for(E element : this) {
            toReturn.add(mapper.map(element));
        }
        return toReturn;
    }

}
