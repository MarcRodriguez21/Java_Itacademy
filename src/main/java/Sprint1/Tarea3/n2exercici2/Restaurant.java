package Sprint1.Tarea3.n2exercici2;

public class Restaurant {

    private String nombre;
    private byte puntuacion;

    public Restaurant(String nombre, byte puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    public String getNombre() {
        return nombre;
    }

    public byte getPuntuacion() {
        return puntuacion;
    }

}
