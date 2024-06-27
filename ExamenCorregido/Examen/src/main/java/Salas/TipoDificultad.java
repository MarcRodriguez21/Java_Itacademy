package Salas;

public enum TipoDificultad {

    FACIL,
    NORMAL,
    DIFICIL;

    public String getDificultad() {
        switch (this) {
            case FACIL:
                return "Facil";
            case NORMAL:
                return "Normal";
            case DIFICIL:
                return "Dificil";
            default:
                return null;
        }
    }
}
