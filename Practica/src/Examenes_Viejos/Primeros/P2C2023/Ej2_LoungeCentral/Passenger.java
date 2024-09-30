package Examenes_Viejos.Primeros.P2C2023.Ej2_LoungeCentral;

public class Passenger {

    private final String name;
    private final String company;
    private int passes;

    public Passenger(String name, String company, int passes) {
    this.name = name;
    this.company = company;
    this.passes = passes;
    }

    public int getPasses() {
        return passes;
    }

    public void usePass() {
        passes--;
    }

    public boolean isCompany(String company) {
        return this.company.equals(company);
    }
}
