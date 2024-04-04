package Sprint1.Tarea1.n1exercici1;

public class Vent extends Instrument {

    public Vent(String nom, int preu) {
        super(nom, preu);
        System.out.println("Se esta llamando al constructor de vent");
    }
    @Override
    public void tocar() {
        System.out.println("Esta sonant un instrument de vent.");

    }

}
