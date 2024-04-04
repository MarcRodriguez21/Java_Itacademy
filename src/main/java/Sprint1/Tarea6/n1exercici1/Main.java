package Sprint1.Tarea6.n1exercici1;

public class Main {

    public static void main(String[] args) {

        Ordenador ordenador = new Ordenador("Asus", "VivoBook", 850.0);
        Ordenador ordenador2 = new Ordenador("Asus", "ZenBook", 1400.0);
        Ordenador ordenador3 = new Ordenador("MSI", "pro", 1500.0);

        System.out.println(ordenador.toString());
        System.out.println(ordenador2.toString());
        System.out.println(ordenador3.toString());

        NoGenericMethods OrdenadorNoGenericMethods1 = new NoGenericMethods(ordenador, ordenador2, ordenador3);
        NoGenericMethods OrdenadorNoGenericMethods2 = new NoGenericMethods(ordenador, ordenador2, ordenador3);

        System.out.println(OrdenadorNoGenericMethods1 + "\n" + OrdenadorNoGenericMethods2);
    }
}
