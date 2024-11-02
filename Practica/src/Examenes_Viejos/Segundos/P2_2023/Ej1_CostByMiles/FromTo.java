package Examenes_Viejos.Segundos.P2_2023.Ej1_CostByMiles;

import java.util.Objects;

public class FromTo {
    private final String from, to;
    public FromTo(String to, String from) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return this.from;
    }
    public String getTo() {
        return this.to;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof FromTo ft && ft.getFrom().equals(from) && ft.getTo().equals(to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
