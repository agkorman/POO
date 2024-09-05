package Guias.Guia4.Ej9_CellPhoneBillExceptions;

public class NumberException extends Exception {

  private static final String MESSAGE = "Error for number %s: ";

  public NumberException(String number, String description) {
    super(MESSAGE.formatted(number) + description);
  }

}

