package Examenes_Viejos.Primeros.P2C2023.Ej2_LoungeCentral;

public class Lounge {

    private int guests;
    private final String name;
    private LoungeCentral central;

    public Lounge(LoungeCentral central, String name) {
        this.central = central;
        this.name = name;
        guests = 0;
    }

    protected boolean canEnter(Passenger p) {
        return p.getPasses() > 0 && central.isOpen();
    }

    public void enter(Passenger p) {
        if (!canEnter(p)) {
            throw new RuntimeException("Cannot enter Lounge");
        }
        p.usePass();
        guests++;
    }

    public void exit(int n) {
        if (n > guests) {
            throw new RuntimeException("Lounge is empty");
        }
        guests--;
    }

    public void exit() {
        exit(1);
    }

    protected int getGuests() {
        return guests;
    }

    @Override
    public String toString() {
        return "%s Lounge has %d guests".formatted(name, guests);
    }

}

