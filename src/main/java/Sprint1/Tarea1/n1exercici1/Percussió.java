package Sprint1.Tarea1.n1exercici1;

public class Percussió extends Instrument{

    public Percussió(String nom, int preu) {
        super(nom,preu);

    }
    @Override
    public void tocar() {
        System.out.println("Esta sonant un instrument de percussió.");
    }




}