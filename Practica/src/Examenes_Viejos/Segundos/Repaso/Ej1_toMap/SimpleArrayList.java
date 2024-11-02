package Examenes_Viejos.Segundos.Repaso.Ej1_toMap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {

    @Override
    public <K> Map<K, T> toMap(Function<T, K> keyMapper) {
        Map<K, T> ans = new HashMap<>();
        for (T elem : this) {
            ans.putIfAbsent(keyMapper.apply(elem), elem);
        }
        return ans;
    }

}
