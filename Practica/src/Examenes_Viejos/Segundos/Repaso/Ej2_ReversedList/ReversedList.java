package Examenes_Viejos.Segundos.Repaso.Ej2_ReversedList;

import java.util.Iterator;
import java.util.List;

public interface ReversedList<T> extends List<T> {

    Iterator<T> defaultIterator();

}
