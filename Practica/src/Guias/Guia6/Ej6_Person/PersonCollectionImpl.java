package Guias.Guia6.Ej6_Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImpl implements PersonCollection{

    // lastName, (firstName, person)
    private Map<String, Map<String, Person>> peopleMap = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {
        if (!peopleMap.containsKey(aPerson.getLastName())) {
            peopleMap.put(aPerson.getLastName(), new HashMap<>());
        }
        peopleMap.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        if(!peopleMap.containsKey(lastName)) {
            return new ArrayList<>();
        }
        return new ArrayList<>(peopleMap.get(lastName).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        if (!peopleMap.containsKey(lastName)) {
            return null;
        }
        return peopleMap.get(lastName).get(firstName);
    }
}
