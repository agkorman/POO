package Taller.Taller13;


import java.util.*;


public class SpecialMap<K, V extends Comparable<? super V>> extends HashMap<K, V> {

   public SortedMap<V, Collection<K>> group(Comparator<V> cmp) {
       SortedMap<V, Collection<K>> ans = new TreeMap<>(cmp);
       for (K key : this.keySet()) {
          V value = this.get(key);
          ans.putIfAbsent(value, new ArrayList<>());
          ans.get(value).add(key);
       }
       return ans;
   }

   public SortedMap<V, Collection<K>> groupByValue() {
       return group(Comparator.naturalOrder());
   }

   public SortedMap<V, Collection<K>> groupByValueReversed() {
       return group(Comparator.reverseOrder());
   }
}
