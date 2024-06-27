package Excepciones;

public class NoHayObjetosDisponiblesException extends RuntimeException {
    public NoHayObjetosDisponiblesException(String message) {
        super(message);
    }
}
