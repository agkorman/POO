package Examenes_Viejos.Primeros.P1C2024.Ej2;

public enum PaymentPlanType {

    STANDARD(12) {
        @Override
        public double apply(double installmentAmount, int installment) {
            return installmentAmount;
        }
    },
    FIRST_THREE_FREE(24) {
        @Override
        public double apply(double installmentAmount, int installment) {
            if (installment <= 3) {
                return 0;
            }
            return installmentAmount;
        }
    },
    HALF_PRICE_EVEN(360) {
        @Override
        public double apply(double installmentAmount, int installment) {
            if (installment % 2 == 0) {
                return installmentAmount / 2;
            }
            return installmentAmount;
        }
    };

    private final int maxInstallments;

    PaymentPlanType(int maxInstallments) {
        this.maxInstallments = maxInstallments;
    }

    public boolean isValid(int installments) {
        return installments <= maxInstallments;
    }

    public abstract double apply(double installmentAmount, int installment);

}
