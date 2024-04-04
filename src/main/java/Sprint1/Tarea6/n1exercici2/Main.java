package Sprint1.Tarea6.n1exercici2;

import Sprint1.Tarea6.n1exercici2.GenericMethods;
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Marc", "Rodriguez", 28);
        Persona persona2 = new Persona("David", "Sanchez", 28);
        Persona persona3 = new Persona("Pedro", "Garcia", 28);

        String nombre = "Carlos";
        String apellido = "Martinez";
        int edad = 456;

        GenericMethods.GenericMethod(persona, nombre, edad);
        System.out.println("\n");
        GenericMethods.GenericMethod(nombre, apellido, persona2);
        System.out.println("\n");
        GenericMethods.GenericMethod(persona3, edad, persona);
    }
}
