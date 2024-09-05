package Taller.Taller4;

public interface List<T> {

    void add(T elem);

    boolean remove(int position);

    int indexOf(T elem);

    boolean isEmpty();

    // Ta acá si vos lo querés,
    default boolean removeElement(T elem) {
        return remove(indexOf(elem));
    }
}
