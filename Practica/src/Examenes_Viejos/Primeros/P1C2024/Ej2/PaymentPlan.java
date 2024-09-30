package Examenes_Viejos.Primeros.P1C2024.Ej2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PaymentPlan implements Iterator<PaymentDetail> {

    private final PaymentPlanType type;
    private final int installments;
    private final double amount;
    private int current;

    public PaymentPlan(PaymentPlanType type, double amount, int installments) {
        if (!type.isValid(installments) || amount <= 0 || installments <= 0) {
            throw new InvalidPaymentPlanException();
        }
        this.type = type;
        this.amount = amount;
        this.installments = installments;
        current = 1;
    }



    @Override
    public boolean hasNext() {
        return current <= installments;
    }

    @Override
    public PaymentDetail next() {
        PaymentDetail ans = peek();
        current++;
        return ans;
    }

    public PaymentDetail peek() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            double auxAmount = (type.apply(amount, current) / installments);
            return new PaymentDetail(current, auxAmount);
        }

}
