package Sprint1.Tarea7.n1exercici1;

public class TrabjadorPresencial extends Trabajador {

    private static float GASOLINA;

    public TrabjadorPresencial(String nombre, String apellidos, int precioHora, float gasolina) {
        super(nombre, apellidos, precioHora);

        GASOLINA = gasolina;
    }

    @Override
    public float calcularSalario(int horas) {
        return super.calcularSalario(horas) + GASOLINA;
    }
    public float getGASOLINA() {
        return GASOLINA;
    }

}
