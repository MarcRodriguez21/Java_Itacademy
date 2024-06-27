package Miscelaneo;

public enum TipoMaterial {
    Madera,
    Metal,
    Plastico,
    Vidrio;

    public String getTipoMaterial() {
        switch (this) {
            case Madera:
                return "Madera";
            case Metal:
                return "Metal";
            case Plastico:
                return "Plastico";
            case Vidrio:
                return "Vidrio";
            default:
                return null;
        }
    }


}
