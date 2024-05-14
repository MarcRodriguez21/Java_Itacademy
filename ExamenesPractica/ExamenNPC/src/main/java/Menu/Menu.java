package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import static Tienda.Tienda.*;

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
                    System.out.println("1. Crear vendedor.");
                    System.out.println("2. Añadir item a vendedor.");
                    System.out.println("3. Consultar items de vendedor.");
                    System.out.println("4. Realizar venta.");
                    System.out.println("5. Salir.");

                    opcion = scanner.nextInt();


                    switch (opcion) {
                        case 1:
                            System.out.println("Creando vendedor...");
                            crearVendedor();
                            break;
                        case 2:
                            System.out.println("Añadiendo item...");
                            añadirItem();
                            break;
                        case 3:
                            mostrarVendedores();
                            break;
                        case 4:
                            break;
                        case 5:
                            System.out.println("Hasta pronto.");
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
                }
            } while (opcion != 5);
        }
    }

