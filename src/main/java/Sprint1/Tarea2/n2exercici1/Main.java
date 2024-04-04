package Sprint1.Tarea2.n2exercici1;

public class Main {

    public static void main(String[] args) {

       Entrada entrada = new Entrada();

       byte age = entrada.leerByte("Introduce tu edad: ");
       int height = entrada.leerInt("Introduce tu altura: ");
       float weight = entrada.leerFloat("Introduce tu peso: ");
       double salary = entrada.leerDouble("Introduce tu sueldo: ");
       char gender = entrada.leerChar("Introduce la primera letra de tu apellido: ");
       String name = entrada.leerString("Introduce tu nombre: ");
       boolean married = entrada.leerSiONo("Estas casado? ");


    }
}
