package Sprint1.Tarea1.n1exercici1;

public class Corda extends Instrument {

    public Corda(String nom, int preu) {
        super(nom, preu);
        System.out.println("Se está llamando al bloque constructor de corda.");
    }
    @Override
    public void tocar() {
        System.out.println("Esta sonant un instrument de corda.");
    }
    {
        System.out.println("Bloque de inicialización de corda.");
    }
    static {
        System.out.println("Instrumento de corda estatico.");
    }

}

