package Taller.Taller9.Ej1_Citizen;

import java.util.*;

public class CitizenTeter {
    public static void main(String[] args) {
        Citizen c1 = new Citizen(123, "Agustin", "Korman");
        Citizen c2 = new Citizen(145, "Rodrigo", "Hernandez");
        Citizen c3 = new Citizen(455, "Edu", "Toroide");
        Citizen c4 = new Citizen(977, "Franco", "Branda");
        Citizen c5 = new Citizen(9999, "Nica", "Novotny");

        SortedMap<Integer, Citizen> citizenByDni = new TreeMap<>();
        Map<String, List<Citizen>> citizenByName = new HashMap<>();
        Map<String, Map<String, List<Citizen>>> citByLastName = new HashMap<>();

        // para acceder por dni
        citizenByDni.putIfAbsent(c1.getDni(), c1);
        citizenByDni.putIfAbsent(c2.getDni(), c2);
        citizenByDni.putIfAbsent(c3.getDni(), c3);

        // para acceder por nombre
        citizenByName.putIfAbsent(c1.getName(), new ArrayList<>());
        citizenByName.get(c1.getName()).add(c1);

        // para acceder por nombre y apellido
        citByLastName.putIfAbsent(c1.getName(), new HashMap<>());
        citByLastName.get(c1.getName()).putIfAbsent(c1.getLastName(), new ArrayList<>());
        citByLastName.get(c1.getName()).get(c1.getLastName()).add(c1);

    }
}
