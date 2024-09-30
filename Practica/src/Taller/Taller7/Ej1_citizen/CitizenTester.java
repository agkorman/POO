package Taller.Taller7.Ej1_citizen;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CitizenTester {
    public static void main(String[] args) {
        Set<Citizen> citizens = new HashSet<>();
        citizens.add(new Citizen(1, "Agustin", "Korman"));
        citizens.add(new Citizen(2, "Pelado", "Peladini"));
        citizens.add(new Citizen(3, "Noaco", "Jolasco"));

        citizens.add(new Citizen(1, "jose", "norberto"));
        //Borra a agustin pués el equals solo compara según dni

        // Set de Citizen con orden natural (ascendente)
        Set<Citizen> sortedCitizenSet = new TreeSet<>();
        citizens.add(new Citizen(1, "Agustin", "Korman"));
        citizens.add(new Citizen(2, "Pelado", "Peladini"));
        citizens.add(new Citizen(3, "Noaco", "Jolasco"));

        Set<Citizen> sortedCitizenSetReversed = new TreeSet<>((o1, o2) -> o2.getDni() - o1.getDni());
        citizens.add(new Citizen(1, "Agustin", "Korman"));
        citizens.add(new Citizen(2, "Pelado", "Peladini"));
        citizens.add(new Citizen(3, "Noaco", "Jolasco"));

        for (Citizen cit : citizens) {
            System.out.println(cit);
        }
    }
}
