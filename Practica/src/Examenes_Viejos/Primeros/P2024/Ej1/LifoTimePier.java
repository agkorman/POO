package Examenes_Viejos.Primeros.P2024;

import java.time.LocalTime;

public class LifoTimePier extends TimePier{

    private String name;
    private FerryCompany company;
    private int occupiedDocks;
    private int MAXDOCKS;
    private LocalTime openTime, closeTime;
    private Ferry last;


    public LifoTimePier(String name, FerryCompany com, int MAX, LocalTime op, LocalTime cl) {
        super(name, com, MAX, op, cl);
    }

    @Override
    public void dock(Ferry ferry, LocalTime time) {
        super.dock(ferry, time);
        this.last = ferry;
    }

    @Override
    public void undock(Ferry ferry, LocalTime time) {
        super.undock(ferry, time);
        this.last = null;
    }

    @Override
    public boolean canUndock(Ferry ferry, LocalTime time) {
        return super.canUndock(ferry, time) && ferry.equals(last);
    }


}
