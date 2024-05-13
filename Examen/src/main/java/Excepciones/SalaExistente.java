package Excepciones;

public class SalaExistente extends Exception {

    public SalaExistente(String message) {
        super("La sala ya existe");
    }
}
