package Taller.Taller9.Ej2_CitizenBook;

public class Citizen implements Comparable<Citizen>{


    private int dni;
    private String name, lastName;

    public Citizen(int dni,String name, String lName) {
        this.dni = dni;
        this.name = name;
        this.lastName = lName;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public int compareTo(Citizen o) {
        return 0;
    }

    @Override
    public String toString() {
        return "[%s %s]".formatted(name, lastName);
    }
}
