package Sprint1.Tarea7.n1exercici2;

public class TrabajadorOnline2 extends Trabajador2 {

    private final float TARIFA;

    public TrabajadorOnline2(String nombre, String apellidos, int precioHora, float tarifa) {
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
