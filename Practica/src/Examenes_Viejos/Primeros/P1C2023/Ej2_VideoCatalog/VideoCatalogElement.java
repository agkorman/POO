package Examenes_Viejos.Primeros.P1C2023.Ej2_VideoCatalog;

import java.time.LocalDate;

public class VideoCatalogElement implements Comparable<VideoCatalogElement> {

    private final String title;
    private final LocalDate airedDate;

    public VideoCatalogElement(String title, LocalDate airedDate) {
        this.title = title;
        this.airedDate = airedDate;
    }

    @Override
    public int compareTo(VideoCatalogElement o) {
        int cmp = o.airedDate.compareTo(airedDate);
        if (cmp == 0) {
            cmp = title.compareTo(o.title);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return "%s aired on %s is a ".formatted(title, airedDate);
    }
}
