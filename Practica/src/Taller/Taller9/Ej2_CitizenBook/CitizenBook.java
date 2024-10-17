package Taller.Taller9.Ej2_CitizenBook;

import java.util.*;

public class CitizenBook {

    private Map<String, SortedSet<Citizen>> book = new HashMap<>();

    public void add(Citizen c) {
        book.putIfAbsent(c.getLastName(), new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName())));
        book.get(c.getLastName()).add(c);
    }

    public Collection<Citizen> getByLastName(String lastName) {
        return book.getOrDefault(lastName, new TreeSet<>());
        }
}
