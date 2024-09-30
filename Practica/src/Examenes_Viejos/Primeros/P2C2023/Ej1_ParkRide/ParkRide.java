package Examenes_Viejos.Primeros.P2C2023.Ej1_ParkRide;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot>{

    private final LocalTime open;
    private LocalTime close;
    private String name;
    private long mins;

    public ParkRide(String name, LocalTime open, LocalTime close, long mins) {
        if (mins <= 0) {
            throw new RuntimeException("Slots minutes must be positive");
        }
        this.open = open;
        setCloseTime(close);
        this.mins = mins;
        this.name = name;
    }

    public void setCloseTime(LocalTime t) {
        if (t.isBefore(open)) {
            throw new RuntimeException("Close time cannot be before open time");
        }
        this.close = t;
    }

    @Override
    public Iterator<ParkSlot> iterator() {
        return new Iterator<ParkSlot>() {
            private LocalTime current = open;
            // me debo hacer auxiliar pq en el tester lo llama después de cambiar el close time
            // y sigue funcionando con el time de cuando hizo el iterador
            private final LocalTime closeTimeIt = close;
            @Override
            public boolean hasNext() {
                return current.isBefore(close);
            }
            // el for each retorna ParkSlots, por ello el next() debe retornar eso
            @Override
            public ParkSlot next() {
                if  (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ParkSlot ans = new ParkSlot(name, current);
                current = current.plusMinutes(mins);
                return ans;
            }
        };
    }
}
