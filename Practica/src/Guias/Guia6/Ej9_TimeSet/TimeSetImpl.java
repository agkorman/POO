package Guias.Guia6.Ej9_TimeSet;

import java.util.*;

public class TimeSetImpl<T> implements TimeSet<T>{

    private Map<T, Pair> map = new HashMap<>();

    @Override
    public void add(T elem, int hours, int minutes) {
        map.put(elem, new Pair(hours, minutes));
    }

    @Override
    public void remove(T elem) {
        if (!map.containsKey(elem)) {
            throw new NoSuchElementException();
        }
        map.remove(elem);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean contains(T elem) {
        return map.containsKey(elem);
    }

    @Override
    public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> ans = new HashSet<>();

        // itero sobre todas las entradas del mapa
        for (Map.Entry<T, Pair> entry : map.entrySet()) {

            T key = entry.getKey();
            Pair i = entry.getValue();

            if (i.isAfter(hoursFrom, minutesFrom) && i.ifBefore(hoursTo, minutesTo)) {
                ans.add(key);
            }
        }
        return ans;
    }
}
