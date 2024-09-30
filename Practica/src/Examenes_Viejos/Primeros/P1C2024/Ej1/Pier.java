package Examenes_Viejos.Primeros.P1C2024.Ej1;

import java.time.LocalTime;

public abstract class Pier {

    private String name;
    private FerryCompany company;
    private int occupiedDocks;
    private int MAXDOCKS;

    public Pier(String name, FerryCompany company, int maxDocks) {
        this.name = name;
        this.company = company;
        this.MAXDOCKS = maxDocks;
    }

    public void dock(Ferry ferry, LocalTime time) {
        if (canDock(ferry, time)) {
            occupiedDocks++;
        } else {
            throw new RuntimeException("Unable to dock");
        }
    }

    public void undock(Ferry ferry, LocalTime time) {
        if (canUndock(ferry, time)) {
            occupiedDocks--;
        } else {
            throw new RuntimeException("Unable to undock");
        }
    }

    protected boolean canDock(Ferry ferry, LocalTime time) {
        return occupiedDocks <= MAXDOCKS;
    }

    protected boolean canUndock(Ferry ferry, LocalTime time) {
        return occupiedDocks > 0;
    }
}
