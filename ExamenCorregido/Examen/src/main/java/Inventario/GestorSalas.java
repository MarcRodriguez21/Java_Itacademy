package Inventario;

import Excepciones.SalaExistente;
import Miscelaneo.Objetos;
import Miscelaneo.Pista;
import Salas.Sala;
import Salas.TipoDificultad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GestorSalas {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Sala> salas = new ArrayList<>();
    private static int idCounter = 1;

    public static void crearSala() {
        String nombre;
        TipoDificultad tipoDificultad = null;

        try {
            System.out.println("Dígame el nombre de la sala: ");
            nombre = scanner.nextLine();

            System.out.println("Dígame el nivel de la sala: (DIFICIL, NORMAL, FACIL)");
            String nivelDificultad = scanner.nextLine().toUpperCase().substring(0, 1);
            switch (nivelDificultad) {
                case "D":
                    tipoDificultad = TipoDificultad.DIFICIL;
                    break;
                case "N":
                    tipoDificultad = TipoDificultad.NORMAL;
                    break;
                case "F":
                    tipoDificultad = TipoDificultad.FACIL;
                    break;
                default:
                    throw new IllegalArgumentException("Nivel de dificultad inválido");
            }

            ArrayList<Pista> pistas = new ArrayList<>();
            ArrayList<Objetos> objetos = new ArrayList<>();
            double precioSala = obtenerPrecioSala(objetos, pistas);
            Sala sala = new Sala(idCounter++, nombre, tipoDificultad, precioSala, pistas, objetos);
            salas.add(sala);
            System.out.println("Sala creada");
            System.out.println(sala);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double obtenerPrecioSala(ArrayList<Objetos> objetos, ArrayList<Pista> pistas) {
        double precioSala = 0;
        for (Objetos objeto : objetos) {
            precioSala += objeto.getPrecio() * objeto.getTipoIva().getPorcentaje();
        }
        for (Pista pista : pistas) {
            precioSala += pista.getPrecio() + pista.getPrecio() * pista.getTipoIVA().getPorcentaje();
        }
        return precioSala;
    }

    public static Sala escogerSala() {
        System.out.println("Escoge una sala");

        IntStream.range(0, salas.size())
                .forEach(i -> System.out.println((i + 1) + ". " + salas.get(i).getNombre()));
        int salaEscogida;
        try {
            salaEscogida = scanner.nextInt() - 1;
        } catch (InputMismatchException e) {
            scanner.next();
            throw new InputMismatchException("Error: Se esperaba un número entero para seleccionar la sala.");
        }
        if (salaEscogida < 0 || salaEscogida >= salas.size()) {
            throw new IndexOutOfBoundsException("Error: El número de sala ingresado está fuera de los límites.");
        }
        return salas.get(salaEscogida);
    }
}
