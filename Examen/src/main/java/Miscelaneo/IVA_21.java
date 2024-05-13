package Miscelaneo;

public class IVA_21 extends Objetos{
    private final double IVA = 0.21;

    public IVA_21(String nombre, double precio, String material, int stock, TipoIVA tipoIva) {
        super(0, nombre, precio, material, stock, TipoIVA.IVA_21);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * IVA;
    }

}
