package Examenes_Viejos.Primeros.P1C2024.Ej1;

public class Ferry {
    private final String name;
    private final FerryCompany company;
    public Ferry(String name, FerryCompany c) {
        this.name = name;
        this.company = c;
    }
    public FerryCompany getCompany() {
        return company;
    }
    @Override
    public String toString() {
        return "Ferry %s".formatted(name);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Ferry f) && f.company.equals(this.company) && f.name.equals(this.name);
    }

    // hashcode
}

