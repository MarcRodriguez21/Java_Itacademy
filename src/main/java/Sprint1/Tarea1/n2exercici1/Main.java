package Sprint1.Tarea1.n2exercici1;

public class Main {

    public static void main(String[] args) {
        Telefono telefono = new Telefono("Samsung", "Galaxy");
        telefono.llamar("69500010");

        Smartphone smartphone = new Smartphone("Iphone", "X");
        smartphone.llamar("69400000");
        smartphone.fotografiar();
        smartphone.alarma();
    }
}
