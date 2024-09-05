package Guias.Guia4.Ej7;
import Guias.Guia4.Ej8.IntervalCondition;
import java.util.Objects;

public class Interval {

    private double start, end, increment;
    private static final String INTERVAL_SEPARATOR = ", ";
    private static final String INTERVAL_START = "[";
    private static final String INTERVAL_END = "]";


    public Interval(double start, double end, double inc) {
        if (Double.compare(inc, 0) == 0) {
            throw new IllegalArgumentException("El incremento no puede ser 0");
        }

        if (start < end && inc < 0) {
            throw new IllegalArgumentException("incremento negativo en lugar del correspondiente");
        }

        if (end < start && inc > 0) {
            throw new IllegalArgumentException("Incremento positivo en lugar del correspondiente");
        }

        this.start = start;
        this.end = end;
        this.increment = inc;
    }

    public Interval(double start, double end) {
        this(start, end, 1);
    }

    /*
    public long size() {
        return (long) Math.abs((end - start) / increment) + 1;
    }
    */

    public long size() {
        return Math.max(0, (int) ((end - start) / increment) + 1);
    }

    /*
    public double at(long index) {
        double answer = start + increment + index;
        if (index < 0) {
            throw new IllegalArgumentException("Fuera de los límites");
        }
        if ((increment < 0 && answer >= end && answer <= start) || (increment > 0 && answer >= start && answer <= end)) {
           return answer;
        }
        throw new IllegalArgumentException("Fuera de los límites");
    }
     */

    public double at(long lugar) {
        double answer = start + increment * lugar;
        if (lugar < 0) {
            throw new IllegalArgumentException("Fuera de los límites");
        }
        if ((increment < 0 && end <= answer && answer <= start)
                || (increment > 0 && start <= answer && answer <= end)) {
            return answer;
        }
        throw new IllegalArgumentException("Fuera de los límites");
    }


    public long indexOf(double valor) {
        double inicio, fin, incremento;
        if (start <= end) {
            inicio = start;
            fin = end;
            incremento = increment;
        } else {
            inicio = end;
            fin = start;
            incremento = -increment;
        }
        for (double rec = inicio; rec <= fin; rec += incremento) {
            if (Double.compare(rec, valor) == 0) {
                return Math.round((rec - start) / increment);
            }
        }
        return -1;
    }


    public boolean includes(double valor) {
        return indexOf(valor) != -1;
    }

    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder(INTERVAL_START);
        double rec = start;
        while ((start <= end && rec <= end) || (start > end && rec >= end)) {
            aux.append(rec).append(INTERVAL_SEPARATOR);
            rec = rec + increment;
        }
        aux.setLength(aux.length() - 2);
        aux.append(INTERVAL_END);
        return aux.toString();
    }





    @Override
    public boolean equals(Object o) {
        return o instanceof Interval interval &&
                Double.compare(interval.start, start) == 0 &&
                Double.compare(interval.end, end) == 0 &&
                Double.compare(interval.increment, increment) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(start, end, increment);
    }

    public int count(IntervalCondition condition) {
        int answer = 0;
        double inicio, fin, incremento;
        if (start <= end) {
            inicio = start;
            fin = end;
            incremento = increment;
        } else {
            inicio = end;
            fin = start;
            incremento = -increment;
        }
        for (double rec = inicio; rec <= fin; rec += incremento) {
            if (condition.satisfies(rec)) {
                answer++;
            }
        }
        return answer;
    }


            }
