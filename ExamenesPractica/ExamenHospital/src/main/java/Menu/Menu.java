package Menu;



import Medicina.TipoConsulta;
import Pacientes.Paciente;
import Medicina.Medico;
import Hospital.Gestion.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Hospital.Gestion.*;


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
                System.out.println("1. Dar de alta paciente.");
                System.out.println("2. Asignar cita.");
                System.out.println("3. Anular cita.");
                System.out.println("4. Listar citas de un paciente.");
                System.out.println("5. Listar citas de un medico.");
                System.out.println("6. Salir.");

                opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("Procedemos a dar de alta un paciente.");
                        darDeAltaPaciente();
                        break;
                    case 2:
                        System.out.println("Crear  cita..");
                        crearCita();
                        break;
                    case 3:
                        System.out.println("Anular cita.");
                        anularCita();
                        break;
                    case 4:
                        System.out.println("Mostrando lista de citas de un paciente.");
                        consultarCitasPaciente();
                        break;
                    case 5:
                        System.out.println("Mostrando lista de citas de un médico");
                        consultarCitasMedico();
                        break;
                    case 6:
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
            }
        } while (opcion != 6);
    }
}