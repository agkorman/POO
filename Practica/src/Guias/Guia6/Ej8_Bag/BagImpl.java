package Guias.Guia6.Ej8_Bag;


import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<T> implements Bag<T>{

    private Map<T, Integer> map = new HashMap<>();


    @Override
    public void add(T elem) {
        if(!map.containsKey(elem)) {
            map.put(elem, 1);
        } else {
            map.put(elem, map.get(elem) + 1);
        }
    }

    @Override
    public void remove(T elem) {
        if (!map.containsKey(elem)) {
            throw new NoSuchElementException();
        }
        if (map.get(elem) == 1) {
            map.remove(elem);
        } else {
            map.put(elem, map.get(elem) - 1);
        }

    }

    @Override
    public int count(T elem) {
        return map.get(elem);
    }

    @Override
    public boolean contains(T elem) {
        return map.containsKey(elem);
    }

    @Override
    public int size() {
        int ans = 0;
        for (int i : map.values()) {
            ans += i;
        }
        return ans;
    }

    @Override
    public int sizeDistinct() {
        return map.size();
    }
}
