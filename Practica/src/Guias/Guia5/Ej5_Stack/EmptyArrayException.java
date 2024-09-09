package Guias.Guia5.Ej5_Stack;

public class EmptyArrayException extends RuntimeException {

    public static final String message = "array vacío loco";

    public EmptyArrayException() {
        super(message);
    }

    // por si el usuario quiere un mensaje casero
    public EmptyArrayException(String msg) {
        super(msg);
    }
}
