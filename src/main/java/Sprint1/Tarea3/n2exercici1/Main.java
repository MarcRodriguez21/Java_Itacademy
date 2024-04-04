package Sprint1.Tarea3.n2exercici1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Restaurant> restaurantes = new HashSet<>();
        menu(restaurantes);
    }

    private static void menu(HashSet<Restaurant> restaurantes) {
        byte op;
        do {
            System.out.println("1. Crear nuevo restaurante");
            System.out.println("2. Mostrar restaurantes");
            System.out.println("3. Salir");
            op = sc.nextByte();
            switch (op) {
                case 1:
                    crearRestaurante(restaurantes);
                    break;
                case 2:
                    mostrarRestaurantes(restaurantes);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (op != 3);
    }

    private static void crearRestaurante(HashSet<Restaurant> restaurantes) {
        System.out.println("Introduce el nombre del nuevo restaurante");
        String nombre = sc.next();
        System.out.println("Introduce la puntuación del nuevo restaurante");
        byte puntuacion = sc.nextByte();
        comprobarRestaurante(restaurantes, nombre, puntuacion);
    }

    private static void mostrarRestaurantes(HashSet<Restaurant> restaurantes) {
        System.out.println("Restaurantes: ");
        for (Restaurant r : restaurantes) {
            System.out.println(r.getNombre() + " - " + r.getPuntuacion());
        }
    }

    private static void comprobarRestaurante(HashSet<Restaurant> restaurantes, String nombre, byte puntuacion) {
        Restaurant nuevo = new Restaurant(nombre, puntuacion);
        boolean restauranteExistente = restaurantes.stream()
                .anyMatch(restaurante -> restaurante.getNombre().equalsIgnoreCase(nombre)
                        && restaurante.getPuntuacion() == puntuacion);
        if (restauranteExistente) {
            System.out.println("El restaurante ya existe. Prueba con otro nombre o con otra puntuación.");
        } else {
            restaurantes.add(nuevo);
            System.out.println("Restaurante creado con éxito");
        }
    }
}
