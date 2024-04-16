package Sprint1.Tarea1.n1exercici1;

public class Percussio extends Instrument{

    public Percussio(String nom, int preu) {
        super(nom,preu);

    }
    @Override
    public void tocar() {
        System.out.println("Esta sonant un instrument de percussió.");
    }




}