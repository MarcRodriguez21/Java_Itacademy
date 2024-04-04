package Sprint1.Tarea7.n1exercici2;

public class TrabjadorPresencial2 extends Trabajador2 {

    private static float GASOLINA;

    public TrabjadorPresencial2(String nombre, String apellidos, int precioHora, float gasolina) {
        super(nombre, apellidos, precioHora);

        GASOLINA = gasolina;
    }

    @Override
    public float calcularSalario(int horas) {
        return super.calcularSalario(horas) + GASOLINA;
    }

    @Deprecated
    public String calcularDietasPresenciales() {
    String mensaje = "Los trabajadores presenciales no consumen dietas.";
    return mensaje;
    }

    public float getGASOLINA() {
        return GASOLINA;
    }


}
