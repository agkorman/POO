package Examenes_Viejos.Primeros.P2024;

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


