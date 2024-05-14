package Personas;

public class Bicicleta extends Repartidor{

    protected static final double PORCENTAJE_EXTRA = 0.01;


    public Bicicleta(String nombre, boolean disponible, TipoDesplazamiento type) {

        super(nombre, disponible, type);
    }

}
