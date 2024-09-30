package Examenes_Viejos.Primeros.P2C2023.Ej3_ReportCollection;

import java.util.Comparator;

public class MaxToMinReport<R> extends MinToMaxReport<R> {

    public MaxToMinReport(Comparator<? super R> cmp) {
        super(new Comparator<R>() {
            @Override
            public int compare(R o1, R o2) {
                return cmp.compare(o2, o1);
            }
        });
    }
}
