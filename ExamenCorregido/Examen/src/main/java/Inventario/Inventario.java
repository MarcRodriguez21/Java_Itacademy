package Inventario;

import Excepciones.NoHayObjetosDisponiblesException;
import Excepciones.NoSalaDisponibleException;
import Miscelaneo.Objetos;
import Miscelaneo.Pista;
import Salas.Sala;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

import static Inventario.GestorObjetos.inventarioObjetos;
import static Inventario.GestorPistas.inventarioPistas;
import static Inventario.GestorSalas.salas;

public class Inventario {

    static Scanner scanner = new Scanner(System.in);

    public static void mostrarInventario() {
        System.out.println("Inventario:");
        mostrarPistas();
        mostrarObjetos();
    }

    private static void mostrarPistas() {
        System.out.println("Estas son las pistas disponibles: ");
        IntStream.range(0, inventarioPistas.size())
                .forEach(i -> System.out.println((i + 1) + ". " + inventarioPistas.get(i).toString()));
    }

    private static void mostrarObjetos() {
        System.out.println("Estos son los objetos disponibles: ");
        if (inventarioObjetos.isEmpty()) {
            throw new NoHayObjetosDisponiblesException("No hay objetos disponibles.");
        }
        IntStream.range(0, inventarioObjetos.size())
                .forEach(i -> System.out.println((i + 1) + ". " + inventarioObjetos.get(i).toString()));
    }

    public static void retirarObjetosInventario() {
        while (true) {
            try {
                System.out.println("Escoge una opción:");
                System.out.println("1. Retirar objeto del inventario.");
                System.out.println("2. Terminar.");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        retirarObjeto();
                        break;
                    case 2:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
            }
        }
    }

    private static void retirarObjeto() {
        while (true) {
            try {
                if (inventarioObjetos.isEmpty()) {
                    throw new NoHayObjetosDisponiblesException("No hay objetos disponibles.");
                }
                IntStream.range(0, inventarioObjetos.size())
                        .forEach(i -> System.out.println((i + 1) + ". " + inventarioObjetos.get(i).getNombre()));
                System.out.println("Escoge un objeto: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion > 0 && opcion <= inventarioObjetos.size()) {
                    inventarioObjetos.remove(opcion - 1);
                    System.out.println("Objeto retirado.");
                    return;
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones.");
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
            }
        }
    }

    public static void mostrarSalas() {
        if (salas.isEmpty()) {
            throw new NoSalaDisponibleException("No hay salas disponibles.");
        }
        System.out.println("Estas son las salas disponibles:");
        IntStream.range(0, salas.size())
                .forEach(i -> System.out.println((i + 1) + ". " + salas.get(i).toString()));
    }
}
