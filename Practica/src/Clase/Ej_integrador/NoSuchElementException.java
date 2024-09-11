package Clase.Ej_integrador;

public class NoSuchElementException extends RuntimeException {

    private static final String message = "No such element";

    public NoSuchElementException() {
        super(message);
    }
}
