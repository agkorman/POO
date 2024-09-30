package Examenes_Viejos.Primeros.P2C2023.Ej2_LoungeCentral;

public class CapLounge extends Lounge {

    private int cap;

    public CapLounge(LoungeCentral central, String name, int cap) {
        super(central, name);
        this.cap = cap;
    }

    @Override
    protected boolean canEnter(Passenger p) {
        return super.canEnter(p) && super.getGuests() < cap;
    }

    @Override
    public String toString() {
        return "%s to %d guests".formatted(super.toString(), cap);
    }



}
