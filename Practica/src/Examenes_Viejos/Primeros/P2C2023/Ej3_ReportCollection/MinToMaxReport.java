package Examenes_Viejos.Primeros.P2C2023.Ej3_ReportCollection;

import java.util.Arrays;
import java.util.Comparator;

public class MinToMaxReport<R> implements ReportCollection<R> {

    @SuppressWarnings("unchecked")
    private R[] elements = (R[]) new Object[INIT_DIM];
    private static final int INIT_DIM = 5;
    private int dim;
    private final Comparator<? super R> cmp;

    public MinToMaxReport(Comparator<? super R> cmp) {
        this.cmp = cmp;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, dim + INIT_DIM);
    }

    @Override
    public void add(R report) {
        if (elements.length == dim) {
            resize();
        }
        elements[dim++] = report;
    }

    public R get(int idx) {
        if (idx < 0 || idx >= dim) {
            throw new IllegalArgumentException();
        }
        return elements[idx];
    }

    public R[] reports() {
        R[] ans = Arrays.copyOf(elements, dim);
        Arrays.sort(ans, cmp);
        return ans;
    }
}
