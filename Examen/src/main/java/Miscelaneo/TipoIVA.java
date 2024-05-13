package Miscelaneo;

public enum TipoIVA {
    IVA_21,
    IVA_10;


    public double getPorcentaje() {
        switch (this) {
            case IVA_21:
                return 0.21;
            case IVA_10:
                return 0.10;
            default:
                return 0.0;
        }
    }
}
