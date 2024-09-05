package Guias.Guia4.Ej9_CellPhoneBillExceptions;

public class TooManyFriendsException extends NumberException {

    private static final String MESSAGE = "Too many friends";

    public TooManyFriendsException(String number) {
        super(number, MESSAGE);
    }

}

