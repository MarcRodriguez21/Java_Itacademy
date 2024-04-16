package Sprint1.Tarea3.n2exercici2;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacion == that.puntuacion &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    @Override
    public int compareTo(Restaurant otroRestaurante) {
        // Ordenar por nombre (si los nombres son diferentes)
        int comparacionPorNombre = this.nombre.compareTo(otroRestaurante.nombre);
        if (comparacionPorNombre != 0) {
            return comparacionPorNombre;
        }
        // Si los nombres son iguales, ordenar por puntuación
        return Byte.compare(this.puntuacion, otroRestaurante.puntuacion);
    }
}