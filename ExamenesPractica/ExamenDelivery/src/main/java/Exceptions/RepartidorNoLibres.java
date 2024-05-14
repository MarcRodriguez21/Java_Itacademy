package Exceptions;

public class RepartidorNoLibres extends Exception {
    public RepartidorNoLibres(String message) {
        super("No hay repartidores disponibles");
    }

}
