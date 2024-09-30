package Examenes_Viejos.Primeros.P1C2024.Ej1;

public class FerryCompany {
    private final String name;
    public FerryCompany(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof FerryCompany fc) && fc.name.equals(this.name);
    }

    // hashcode

}


