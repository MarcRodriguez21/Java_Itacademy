package Sprint1.Tarea7.n1exercici1;

public class TrabajadorOnline  extends Trabajador {

    private final float TARIFA;

    public TrabajadorOnline(String nombre, String apellidos, int precioHora, float tarifa) {
        super(nombre, apellidos, precioHora);
        TARIFA = tarifa;
    }
    @Override
    public float calcularSalario(int horas) {
        return (super.calcularSalario(horas) + TARIFA);
    }

    public float getTARIFA() {
        return TARIFA;
    }


}
