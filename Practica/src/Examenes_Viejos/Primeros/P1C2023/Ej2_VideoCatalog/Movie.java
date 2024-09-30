package Examenes_Viejos.Primeros.P1C2023.Ej2_VideoCatalog;

import java.time.LocalDate;

public class Movie extends VideoCatalogElement{

    private final String studio;


    public Movie(String title, LocalDate airedDate, String studio) {
        super(title, airedDate);
        this.studio = studio;
    }

    @Override
    public String toString() {
        return "%s Movie from %s".formatted(super.toString(), studio);
    }

}


