package Examenes_Viejos.Primeros.P1C2023.Ej2_VideoCatalog;

import java.time.LocalDate;

public class TVEpisode extends VideoCatalogElement {

    private final int season;


    public TVEpisode(String title, LocalDate airedDate, int season) {
        super(title, airedDate);
        this.season = season;
    }

    @Override
    public String toString() {
        return "%s TV episode of Season %d".formatted(super.toString(), season);
    }
}

