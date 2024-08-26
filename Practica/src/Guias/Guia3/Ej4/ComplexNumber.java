package Guias.Guia3.Ej4;

import java.util.Objects;

public class ComplexNumber {
    private double imPart;
    private double rPart;

    public ComplexNumber(double realPart, double imgPart) {
        this.imPart = imgPart;
        this.rPart = realPart;
    }

    public ComplexNumber(double realPart) {
        this.rPart = realPart;
        this.imPart = 0;
    }

    @Override
    public boolean equals(Object ob) {
        double eps = 0.0001;
        if (!(ob instanceof ComplexNumber num)) {
            return false;
        }
        if ((this.rPart - num.rPart) < eps && (this.imPart - num.imPart) < 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(rPart, imPart);
    }

    public ComplexNumber plus(double real) {
        return new ComplexNumber(this.rPart + real, this.imPart);
    }

    public ComplexNumber plus(ComplexNumber num) {
        return new ComplexNumber(this.rPart + num.rPart, this.imPart + num.imPart);
    }

    @Override
    public String toString() {
        return "%.2f %s %.2f i".formatted(rPart, imPart < 0 ? "-" : "+", imPart);
    }

}
