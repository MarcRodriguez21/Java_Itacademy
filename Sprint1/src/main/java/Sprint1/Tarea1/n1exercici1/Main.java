package Sprint1.Tarea1.n1exercici1;

public class Main {
    public static void main(String[] args) {

        System.out.println("LLamando desde el main a " + Instrument.staticNumber);

        Corda guitarra = new Corda("guitarra", 120);
        guitarra.tocar();

        Corda guitarra2 = new Corda("bajo", 120);
        guitarra2.tocar();

        Vent trompeta = new Vent("trompeta", 120);
        trompeta.tocar();

        Percussió bateria = new Percussió("bateria", 120);
        bateria.tocar();
    }
}
