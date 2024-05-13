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
                System.out.println("*************");
                System.out.println("MENU PRINCIPAL");
                System.out.println("*************");
                System.out.println("Seleccione una opción: ");
                System.out.println("-----------------");
                System.out.println("1. Crear Sala.");
                System.out.println("2. Añadir pista a sala");
                System.out.println("3. Añadir objetos a sala.");
                System.out.println("4. Mostrar inventario.");
                System.out.println("5. Retirar objetos del inventario.");
                System.out.println("6. Mostrar salas.");
                System.out.println("7. Salir.");

                opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Creando sala.");
                        crearSala();
                        break;
                    case 2:
                        System.out.println("Añadiendo pista a la sala");
                        añadirPistaSala();
                        break;
                    case 3:
                        System.out.println("Añadiendo objetos a la sala");
                        añadirObjetosSala();
                        break;
                    case 4:
                        System.out.println("Mostrando inventario");
                        mostrarInventario();
                        break;
                    case 5:
                        System.out.println("Retirando objetos del inventario");
                        retirarObjetosInventario();
                        break;
                    case 6:
                        System.out.println("Mostrando salas.");
                        mostrarSalas();
                        break;
                    case 7:
                        System.out.println("Saliendo");
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
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
}

