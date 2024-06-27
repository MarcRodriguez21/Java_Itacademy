package Inventario;

import Excepciones.NoHayObjetosDisponiblesException;
import Excepciones.ObjetoNoDisponibleException;
import Miscelaneo.Objetos;
import Miscelaneo.TipoIVA;
import Miscelaneo.TipoMaterial;
import Salas.Sala;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import static Inventario.GestorSalas.*;

public class GestorObjetos {

    private static final Objetos hacha = new Objetos(1, "Hacha", 10.0, TipoMaterial.Madera, 10, TipoIVA.IVA_21);
    private static Objetos martillo = new Objetos(2, "Martillo", 20.0, TipoMaterial.Metal, 5, TipoIVA.IVA_21);
    private static Objetos pala = new Objetos(3, "Pala", 30.0, TipoMaterial.Madera, 15, TipoIVA.IVA_21);
    private static Objetos llave = new Objetos(4, "Llave", 2.0, TipoMaterial.Metal, 20, TipoIVA.IVA_21);
    private static Objetos laser = new Objetos(5, "Laser", 10.0, TipoMaterial.Plastico, 20, TipoIVA.IVA_21);
    private static Objetos boligrafo = new Objetos(6, "Boligrafo", 1.0, TipoMaterial.Plastico, 15, TipoIVA.IVA_21);



    public static ArrayList<Objetos> inventarioObjetos = new ArrayList<>(List.of(hacha, martillo, pala, llave, laser, boligrafo));


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
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        try {
                            Objetos objeto = escogerObjeto();
                            objetos.add(objeto);
                        } catch (NoHayObjetosDisponiblesException | ObjetoNoDisponibleException e) {
                            System.out.println(e.getMessage());
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
        if (inventarioObjetos.isEmpty()) {
            throw new NoHayObjetosDisponiblesException("No hay objetos disponibles.");
        }

        while (true) {
            try {
                for (int i = 0; i < inventarioObjetos.size(); i++) {
                    System.out.println((i + 1) + ". " + inventarioObjetos.get(i).getNombre());
                }
                System.out.println("Escoge una objeto: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion > 0 && opcion <= inventarioObjetos.size()) {
                    if (inventarioObjetos.get(opcion - 1).getStock() == 0) {
                        throw new ObjetoNoDisponibleException("El objeto no está disponible.");
                    }

                    inventarioObjetos.get(opcion - 1).setStock(inventarioObjetos.get(opcion - 1).getStock() - 1);
                    return inventarioObjetos.get(opcion - 1);
                } else {
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                scanner.next();
            }
        }
    }
}
