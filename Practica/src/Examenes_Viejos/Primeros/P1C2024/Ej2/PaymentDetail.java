package Examenes_Viejos.Primeros.P1C2024.Ej2;

public class PaymentDetail {
    private final int installment;
    private final double installmentAmount;
    public PaymentDetail(int installment, double installmentAmount) {
        this.installment = installment;
        this.installmentAmount = installmentAmount;
    }
    @Override
    public String toString() {
        return "$%.2f due for installment %d".formatted(installmentAmount, installment);
    }
}

