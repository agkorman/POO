package Examenes_Viejos.Primeros.P2C2023.Ej2_LoungeCentral;

public class VipLounge extends CapLounge {

    private final String company;

    public VipLounge(LoungeCentral central, String name, int cap, String company) {
        super(central, name, cap);
        this.company = company;
    }

    @Override
    protected boolean canEnter(Passenger p) {
        return super.canEnter(p) && p.isCompany(company);
    }

    @Override
    public String toString() {
        return "%s %s".formatted(company, super.toString());
    }


}
