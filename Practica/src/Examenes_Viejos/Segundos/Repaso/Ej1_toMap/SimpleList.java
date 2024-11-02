package Examenes_Viejos.Segundos.Repaso.Ej1_toMap;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface SimpleList<T> extends List<T> {

    <K> Map<K, T> toMap(Function<T, K> keyMapper);

}
