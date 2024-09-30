package Examenes_Viejos.Primeros.P1C2024.Ej1;

import java.time.LocalTime;

public class TimePier extends Pier{

    private String name;
    private FerryCompany company;
    private int occupiedDocks;
    private int MAXDOCKS;
    private LocalTime openTime, closeTime;

    public TimePier(String name, FerryCompany company, int MAXDOCKS, LocalTime op, LocalTime cl) {
        super(name, company, MAXDOCKS);
        this.openTime = op;
        this.closeTime = cl;
    }

    @Override
    protected boolean canDock(Ferry ferry, LocalTime time) {
        if (time.isAfter(openTime) && time.isBefore(closeTime)) {
            return super.canDock(ferry, time);
        }
        return false;
    }


}
