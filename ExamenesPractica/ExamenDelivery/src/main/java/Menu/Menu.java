package Menu;

import Exceptions.RepartidorNoLibres;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Pedidos.DatosPedido.*;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion=0;

        do {

            try {
                System.out.println("*************");
                System.out.println("MENU PRINCIPAL");
                System.out.println("*************");
                System.out.println("Seleccione una opción: ");
                System.out.println("-----------------");
                System.out.println("1. Crear pedido.");
                System.out.println("2. Marcar pedido como entregado.");
                System.out.println("3. Listar pedidos pendientes.");
                System.out.println("4. Listar pedidos entregados.");
                System.out.println("5. Salir.");

                opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Procedemos a crear un nuevo pedido.");
                        crearPedido();
                        break;
                    case 2:
                        System.out.println("Procedemos a marcar un pedido como entregado.");
                        marcarEntregado();
                        break;
                    case 3:
                        System.out.println("Aquí se muestra la lista de pedidos pendientes.");
                        mostrarPedidos();
                        break;
                    case 4:
                        System.out.println("Aquí se muestra la lista de pedidos entregados.");
                        mostrarPedidosEntregados();
                        break;
                    case 5:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }

            }
            catch(InputMismatchException e){
                System.out.println();
                System.out.println("Entrada no valida. Por favor, introduzca un número de la lista.");
                scanner.nextLine();
            } catch (RepartidorNoLibres e) {
                throw new RuntimeException(e);
            }

        } while (opcion != 5);
    }
}