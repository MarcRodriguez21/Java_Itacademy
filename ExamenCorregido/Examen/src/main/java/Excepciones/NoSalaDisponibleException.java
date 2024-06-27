package Excepciones;

public class NoSalaDisponibleException extends RuntimeException{
    public NoSalaDisponibleException(String message) {
        super(message);
    }
}
