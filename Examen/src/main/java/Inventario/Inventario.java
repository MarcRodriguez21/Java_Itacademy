package Inventario;

import Excepciones.SalaExistente;
import Miscelaneo.Objetos;
import Miscelaneo.Pista;
import Miscelaneo.TipoIVA;
import Salas.Sala;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Inventario {

    static Scanner scanner = new Scanner(System.in);


    private static Objetos objeto1 = new Objetos(1, "Hacha", 10.0, "Plastico", 10, TipoIVA.IVA_21);
    private static Objetos objeto2 = new Objetos(2, "Martillo", 20.0, "Metal", 5, TipoIVA.IVA_21);
    private static Objetos objeto3 = new Objetos(3, "Pala", 30.0, "Madera", 15, TipoIVA.IVA_21);
    private static Objetos objeto4 = new Objetos(4, "Llave", 2.0, "Metal", 20, TipoIVA.IVA_21);
    private static Objetos objeto5 = new Objetos(5, "Laser", 10.0, "Plastico", 20, TipoIVA.IVA_21);
    private static Objetos objeto6 = new Objetos(6, "Boligrafo", 1.0, "Plastico", 15, TipoIVA.IVA_21);

    private static Pista pista1 = new Pista(1, "Pista 1", 10.0, "60 min.", "Miedo", TipoIVA.IVA_10);
    private static Pista pista2 = new Pista(2, "Pista 2", 15.0, "30 min.", "Miedo", TipoIVA.IVA_10);
    private static Pista pista3 = new Pista(3, "Pista 3", 20.0, "200 min.", "Acción", TipoIVA.IVA_10);
    private static Pista pista4 = new Pista(4, "Pista 4", 25.0, "150 min.", "Acción", TipoIVA.IVA_10);
    private static Pista pista5 = new Pista(5, "Pista 5", 30.0, "100 min.", "Aventura", TipoIVA.IVA_10);

    private static ArrayList<Pista> pistas = new ArrayList<>(List.of(pista1, pista2, pista3, pista4, pista5));
    private static ArrayList<Objetos> objetos = new ArrayList<>(List.of(objeto1, objeto2, objeto3, objeto4, objeto5, objeto6));
    private static ArrayList<Sala> salas = new ArrayList<>();

    public static void crearSala() {
        int id;
        String nombre;
        String nivel;

        try{
        System.out.println("Dígame el ID de la sala: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido para el ID de la sala.");
            scanner.next();
        }
        id = scanner.nextInt();
        scanner.nextLine();
        for (Sala sala : salas) {
            if (sala.getId() == id) {
                throw new SalaExistente("La sala ya existe");
            }
        }
        System.out.println("Dígame el nombre de la sala: ");
        nombre = scanner.nextLine();

        System.out.println("Dígame el nivel de la sala: (Dificil, Medio, Facil)");
        nivel = scanner.nextLine();

        ArrayList<Pista> pistas = new ArrayList<>();
        ArrayList<Objetos> objetos = new ArrayList<>();
        double precioSala = obtenerPrecioSala(objetos, pistas);
        Sala sala = new Sala(id, nombre, nivel, precioSala, pistas, objetos);
        salas.add(sala);
        System.out.println("Sala creada");
        System.out.println(sala);
        } catch (SalaExistente e){
            System.out.println(e.getMessage());
        }
    }

    public static void añadirPistaSala() {
        Sala sala = escogerSala();
        ArrayList<Pista> pistas = new ArrayList<>();
        pistas = añadirAlCarritoPistas();
        sala.setPistas(pistas);
        double precioSala = obtenerPrecioSala(sala.getObjetos(), sala.getPistas());
        sala.setPrecio(precioSala);
        System.out.println("Pistas añadidas");
        System.out.println(sala);
    }

    private static Sala escogerSala() {
        try {
            System.out.println("Escoge una sala");
            for (int i = 0; i < salas.size(); i++) {
                System.out.println((i + 1) + ". " + salas.get(i).getNombre());
            }
            int salaEscogida;
            try {
                salaEscogida = scanner.nextInt() - 1;
            } catch (InputMismatchException e) {
                scanner.next();
                throw new InputMismatchException("Error: Se esperaba un número entero para seleccionar el cliente.");
            }

            if (salaEscogida < 0 || salaEscogida >= salas.size()) {
                throw new IndexOutOfBoundsException("Error: El número de cliente ingresado está fuera de los límites.");
            }

            return salas.get(salaEscogida);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    private static ArrayList<Pista> añadirAlCarritoPistas() {
        ArrayList<Pista> pistas = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Escoge una opción:");
                System.out.println("1. Añadir pista.");
                System.out.println("2. Terminar.");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        Pista pista = escogerPista();
                        if (pista != null) {
                            pistas.add(pista);
                        }
                        break;
                    case 2:
                        return pistas;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }
    private static Pista escogerPista() {

        while (true) {
            try {
                for(int i = 0; i < pistas.size(); i++) {
                    System.out.println((i + 1) + ". " + pistas.get(i).getNombre());
                }
                System.out.println("Escoge una pista: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion > 0 && opcion <= pistas.size()) {
                    return pistas.get(opcion - 1);
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }

    public static void añadirObjetosSala() {
        Sala sala = escogerSala();
        ArrayList<Objetos> objetos = new ArrayList<>();
        objetos = añadirAlCarritoObjetos();
        sala.setObjetos(objetos);
        double precioSala = obtenerPrecioSala(sala.getObjetos(), sala.getPistas());
        sala.setPrecio(precioSala);
        System.out.println("Objetos añadidos");
        System.out.println(sala);
    }

    private static ArrayList<Objetos> añadirAlCarritoObjetos() {
        ArrayList<Objetos> objetos = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Escoge una opción:");
                System.out.println("1. Añadir objeto.");
                System.out.println("2. Terminar.");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        Objetos objeto = escogerObjeto();
                        if (objeto != null) {
                            objetos.add(objeto);
                        }
                        break;
                    case 2:
                        return objetos;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }
    private static Objetos escogerObjeto() {

        while (true) {
            try {
                if (objetos.isEmpty()) {
                    System.out.println("No hay objetos disponibles.");
                    return null;
                }
                for(int i = 0; i < objetos.size(); i++) {
                    System.out.println((i + 1) + ". " + objetos.get(i).getNombre());
                }
                System.out.println("Escoge una objeto: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion > 0 && opcion <= objetos.size()) {
                    if (objetos.get(opcion - 1).getStock() == 0) {
                        System.out.println("El objeto no está disponible");
                        return null;
                    }
                    objetos.get(opcion - 1).setStock(objetos.get(opcion - 1).getStock() - 1);
                    return objetos.get(opcion - 1);
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }

    private static double obtenerPrecioSala(ArrayList<Objetos> objetos, ArrayList<Pista> pistas) {
        double precioSala = 0;
        for (Objetos objeto : objetos) {
            precioSala += objeto.getPrecio() * objeto.getTipoIva().getPorcentaje();
        }
        for (Pista pista : pistas) {
            precioSala += pista.getPrecio() + pista.getPrecio() * pista.getTipoIVA().getPorcentaje();
        }
        return precioSala;
    }

    public static void mostrarInventario() {
        System.out.println("Inventario:");
        System.out.println("Estas son las pistas disponibles: ");
        for (int i = 0; i < pistas.size(); i++) {
            System.out.println((i + 1) + ". " + pistas.get(i).toString());
        }
        System.out.println("Estos son los objetos disponibles: ");
        if (objetos.isEmpty()) {
            System.out.println("No hay objetos disponibles.");
        }
        for (int i = 0; i < objetos.size(); i++) {
            System.out.println((i + 1) + ". " + objetos.get(i).toString());
        }
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
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }

    private static void retirarObjeto() {

        while (true) {
            try {
                if (objetos.isEmpty()) {
                    System.out.println("No hay objetos disponibles.");
                    return;
                }
                for(int i = 0; i < objetos.size(); i++) {
                    System.out.println((i + 1) + ". " + objetos.get(i).getNombre());
                }
                System.out.println("Escoge un objeto: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion > 0 && opcion <= objetos.size()) {
                    objetos.remove(opcion - 1);
                    System.out.println("Objeto retirado.");
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }
    public static void mostrarSalas() {
        if (salas.isEmpty()) {
            System.out.println("No hay salas disponibles.");
            return;
        }
        for (int i = 0; i < salas.size(); i++) {
            System.out.println((i + 1) + ". " + salas.get(i).toString());
        }
    }
}
