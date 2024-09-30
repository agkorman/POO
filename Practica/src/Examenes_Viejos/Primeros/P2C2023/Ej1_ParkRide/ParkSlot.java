package Examenes_Viejos.Primeros.P2C2023.Ej1_ParkRide;

import java.time.LocalTime;

public class ParkSlot {

    private final String ride;
    private final LocalTime time;

    public ParkSlot(String ride, LocalTime time) {
        this.ride = ride;
        this.time = time;
    }

    @Override
    public String toString() {
        return "%s <> %s Slot".formatted(ride, time);
    }
}
