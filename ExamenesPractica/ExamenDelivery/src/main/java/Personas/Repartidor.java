package Personas;

public class Repartidor {

    protected String nombre;
    protected boolean disponible;
    protected TipoDesplazamiento type;

    // Constructor
    public Repartidor(String nombre, boolean disponible, TipoDesplazamiento type) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.type = type;
    }

    // Getters y Setters
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoDesplazamiento getTipoDesplazamiento() {
        return type;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                ", type=" + type +
                '}';
    }
}
