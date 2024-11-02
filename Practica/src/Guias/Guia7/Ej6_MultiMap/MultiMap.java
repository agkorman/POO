package Guias.Guia7.Ej6_MultiMap;

public interface MultiMap<K, V>{
    /**
     * Agrega un par key,value al multimapa si el par no existe.
     */
    void put(K key, V value);

    /**
     * Cantidad de valores del multimapa.
     */
    int size();

    /**
     * Cantidad de valores del multimapa para la clave key.
     */
    int size(K key);

    /**
     * Elimina la clave del multimapa (con todos sus valores) si existe.
     */
    void remove(K key);

    /**
     * Elimina el valor value de la clave key si existe.
     */
    void remove(K key, V value);

    /**
     * Colección ordenada descendentemente de valores de clave key.
     */
    Iterable<V> get(K key);
}

