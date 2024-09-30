package Taller.Taller7.Ej2_BoardingFlight;

import java.util.Comparator;

public class RowBoardingFlight extends BoardingFlight{

    public RowBoardingFlight() {
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmp = o1.getRow() - (o2.getRow());
                if (cmp == 0) {
                    cmp = o1.getName().compareTo(o2.getName());
                }
                return cmp;
            }
        });
    }
}
