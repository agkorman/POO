package Taller.Taller7.Ej2_BoardingFlight;

import java.util.Comparator;

public class CategoryBoardingFlight extends BoardingFlight {

    public CategoryBoardingFlight() {
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmp = o1.getCategory().compareTo(o2.getCategory());
                if (cmp == 0) {
                    cmp = o1.getName().compareTo(o2.getName());
                }
                return cmp;
            }
        });
    }

}
