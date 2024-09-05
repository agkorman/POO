package Guias.Guia4.Ej9_CellPhoneBillExceptions;

public class FriendAlreadyExistsException extends NumberException {

  private static final String MESSAGE = "Friend already exists";

  public FriendAlreadyExistsException(String number) {
    super(number, MESSAGE);
  }

}

