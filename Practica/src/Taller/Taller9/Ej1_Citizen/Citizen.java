package Taller.Taller9.Ej1_Citizen;

public class Citizen {

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
}
