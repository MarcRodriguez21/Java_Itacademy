package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import static Inventario.Inventario.*;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion=0;

        do {

            try {
                System.out.println("*************\n" +
                        "MENU PRINCIPAL\n" +
                        "*************\n" +
                        "Seleccione una opción: \n" +
                        "-----------------\n" +
                        "1. Crear Sala.\n" +
                        "2. Añadir pista a sala\n" +
                        "3. Añadir objetos a sala.\n" +
                        "4. Mostrar inventario.\n" +
                        "5. Retirar objetos del inventario.\n" +
                        "6. Mostrar salas.\n" +
                        "7. Salir.");
                opcion = scanner.nextInt();
                scanner.nextLine();
                String respuesta = "";
                switch (opcion) {
                    case 1:
                        respuesta("Creando sala.");
                        crearSala();
                        break;
                    case 2:
                        respuesta("Añadiendo pista a la sala");
                        añadirPistaSala();
                        break;
                    case 3:
                        respuesta("Añadiendo objetos a la sala");
                        añadirObjetosSala();
                        break;
                    case 4:
                        respuesta("Mostrando inventario");
                        mostrarInventario();
                        break;
                    case 5:
                        respuesta("Retirando objetos del inventario");
                        retirarObjetosInventario();
                        break;
                    case 6:
                        respuesta("Mostrando salas");
                        mostrarSalas();
                        break;
                    case 7:
                        respuesta("Saliendo");
                        break;
                    default:
                        respuesta("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println();
                System.out.println("Entrada no valida. Por favor, introduzca un número de la lista.");
                scanner.nextLine();
            }
        } while (opcion != 7);
    }
    private String respuesta(String respuesta){
        System.out.println(respuesta);
        return respuesta;
    }
}

