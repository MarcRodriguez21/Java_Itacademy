package Personas;

public class Moto extends Repartidor {

    protected static final double PORCENTAJE_EXTRA = 0.02; // 2%

    public Moto(String nombre, boolean disponible, TipoDesplazamiento type) {
        super(nombre, disponible, type);
    }

}
