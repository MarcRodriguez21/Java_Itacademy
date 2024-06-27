package Miscelaneo;

public enum TipoIVA {


    IVA_21(0.21),
    IVA_10(0.10);

    private double porcentaje;

    TipoIVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

}
