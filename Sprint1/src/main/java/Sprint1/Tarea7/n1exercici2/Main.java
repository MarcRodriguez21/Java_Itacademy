package Sprint1.Tarea7.n1exercici2;

public class Main {

    public static void main(String[] args) {
        TrabajadorOnline2 t1 = new TrabajadorOnline2("Pepe", "Gonzalez", 10, 100.60f);
        TrabjadorPresencial2 t2 = new TrabjadorPresencial2("Pepa", "Gonzalez", 10, 27.4f);

        System.out.println("Sueldo del trabjador/a presencial " + t2.getNombre() + ": " +
                "\n\tPrecio por hora: " + t2.getPrecioHora() +
                "\n\t Gasolina consumida: " + t2.getGASOLINA());
        System.out.println(t2.calcularSalario(40) + " €");
        System.out.println(t2.calcularDietasPresenciales());


        System.out.println("Sueldo del trabajador/a online " + t1.getNombre() + ": " +
                "\n\tPrecio por hora: " + t1.getPrecioHora() +
                "\n\t Internet consumido: " + t1.getTARIFA());
        System.out.println(t1.calcularSalario(40) + " €");
    }
}
