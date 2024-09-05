package Guias.Guia4.Ej9_CellPhoneBillExceptions;

public class FriendNotFoundException extends NumberException {

    private static final String MESSAGE = "Friend not found";

    public FriendNotFoundException(String number) {
        super(number, MESSAGE);
    }

}

