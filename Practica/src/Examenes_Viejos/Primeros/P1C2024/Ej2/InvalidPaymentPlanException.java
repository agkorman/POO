package Examenes_Viejos.Primeros.P1C2024.Ej2;

public class InvalidPaymentPlanException extends RuntimeException {


  private static final String MESSAGE = "Invalid payment plan";


  public InvalidPaymentPlanException() {
    super(MESSAGE);
  }


}

