package Examenes_Viejos.Primeros.P1C2023.Ej2_VideoCatalog;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class VideoCatalog {

    private VideoCatalogElement[] catalog = new VideoCatalogElement[INITIAL_DIM];
    private static final int INITIAL_DIM = 5;
    private int dim;

    public VideoCatalog() {
        dim = 0;
    }

    public void add(String title, LocalDate airedDate, int season) {
        isItFull();
        catalog[dim++] = new TVEpisode(title, airedDate, season);
    }

    public void add(String title, LocalDate airedDate, String studio) {
        isItFull();
        catalog[dim++] = new Movie(title, airedDate, studio);
    }


    public VideoCatalogElement[] getCumtomCopy(Comparator<VideoCatalogElement> cmp) {
        VideoCatalogElement[] ans = Arrays.copyOf(catalog, dim);
        Arrays.sort(catalog, cmp);
        return ans;
    }

    public VideoCatalogElement[] getDescendingDateCopy() {
        return getCumtomCopy(Comparator.naturalOrder());
    }

    public VideoCatalogElement[] getChronologicalDateCopy() {
        return getCumtomCopy(Comparator.reverseOrder());
    }

    private void isItFull() {
        if (dim == catalog.length) {
            resize();
        }
    }


    private void resize() {
        catalog = Arrays.copyOf(catalog, dim + INITIAL_DIM);
    }
}
