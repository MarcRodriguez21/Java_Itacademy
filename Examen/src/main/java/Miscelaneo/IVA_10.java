package Miscelaneo;

public class IVA_10 extends Pista {
    private final double IVA = 0.10;
    public IVA_10(int id, String nombre, int precio, String tiempoEstimado, String tematica) {
        super(id, nombre, precio, tiempoEstimado, tematica, TipoIVA.IVA_10);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * IVA;
    }
}
