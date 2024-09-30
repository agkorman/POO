package Taller.Taller7.Ej1_citizen;

import java.util.Objects;

public class Citizen implements Comparable<Citizen>{
    private int dni;
    private String name, lastName;

    public Citizen(int dni, String name, String lastName) {
        if (dni < 0) {
            throw new IllegalArgumentException();
        }
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Citizen c && dni == (c.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "dni: %d nombre: %s apellido: %s".formatted(dni, name, lastName);
    }

    public int getDni(){
        return dni;
    }

    // al implementar Comparable, no es necesario implementar hashCode y equals pués compareTo cumple su rol.
    // compareTo bien implementado asegura que no va a haber poblemas de comparación
    @Override
    public int compareTo(Citizen o) {
        return this.dni - o.dni;
    }
}
