package Hospital;

import Medicina.*;
import Pacientes.Paciente;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestion {

    static Scanner sc = new Scanner(System.in);

    private static int contadorCitas = 1;


    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static ArrayList<Cita> citas = new ArrayList<>();
    private static ArrayList<String> diagnosticos = new ArrayList<>();
    static {
            // Instanciar objetos de las subclases de Medico y agregarlos a la lista
            medicos.add(new Traumatologia("Pedro", "Traumatologia", TipoConsulta.TRAUMATOLOGIA));
            medicos.add(new General("Carlos", "General", TipoConsulta.GENERAL));
            medicos.add(new Neurologia("Juan", "Neurologia", TipoConsulta.NEUROLOGIA));
    }

    public static void darDeAltaPaciente() {
        Paciente paciente = new Paciente("", "", "", diagnosticos);
        System.out.println("Dígame el número de identificación del paciente: ");
        String id = sc.nextLine();
        System.out.println("Dígame el nombre del paciente: ");
        String nombre = sc.nextLine();
        if (nombre.trim().isEmpty() || id.trim().isEmpty()) {
            System.out.println("Error: El nombre y el número de identificación del paciente no pueden estar vacíos.");
            return;
        }
        paciente = new Paciente(nombre, id, paciente.getNumeroHospital(), diagnosticos);
        pacientes.add(paciente);
    }
    public static void mostrarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println((i + 1) + " Nombre: " + pacientes.get(i).getNombre() + " | Id: " + pacientes.get(i).getId() + " | Num. Hospital: " + pacientes.get(i).getNumeroHospital());
            }
        }
    }

    public static void crearCita() {
        boolean citaCreada = false;
        while (!citaCreada) {
            System.out.println("Dígame la fecha de la cita: ");
            String fecha = sc.nextLine();
            System.out.println("Dígame la hora de la cita: ");
            String hora = sc.nextLine();
            Paciente paciente = escogerPaciente();
            int numIntentos = 0;
            while (paciente == null && numIntentos < 3) {
                System.out.println("Paciente no encontrado. Intente de nuevo.");
                paciente = escogerPaciente();
                numIntentos++;
                if (paciente == null) {
                    System.out.println("Intentos restantes: " + (3 - numIntentos));
                }
            }
            Medico medico = escogerMedico();
            while (medico == null && numIntentos < 3) {
                System.out.println("Medico no encontrado. Intente de nuevo.");
                medico = escogerMedico();
                numIntentos++;
                if (medico == null) {
                    System.out.println("Intentos restantes: " + (3 - numIntentos));
                }
            }
            int numeroDeCita = obtenerNumeroDeCita();
            Cita nuevaCita = new Cita(paciente, medico, fecha, hora, numeroDeCita);
            contadorCitas++;
            citas.add(nuevaCita);
            System.out.println("Cita creada.");
            citaCreada = true;
            System.out.println("Desea ejecutar alguna prueba con ese médico? (s/n)");
            String decision = sc.nextLine();
            if (decision.equalsIgnoreCase("s")) {
                ejecutarPr_Test(medico, paciente, nuevaCita);
            }else{
                System.out.println("No se realizarán pruebas.");
            }
        }

    }
    private static void ejecutarPr_Test(Medico medico, Paciente paciente, Cita nuevaCita) {
        System.out.println("Procedemos a realizar la prueba:");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Medico: " + medico.getNombre());
        String prueba = medico.diagnostico();
        System.out.println("Diagnostico: " + prueba);
        String pruebaRealizada = "Se ha hecho una prueba el día " + nuevaCita.getFecha() + " a las " + nuevaCita.getHora() +" horas. " + prueba;
        diagnosticos.add(pruebaRealizada);
    }

    private static Paciente escogerPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return null;
        }
        System.out.println("Seleccione el paciente: ");
        mostrarPacientes();
        try {
            int numPaciente = sc.nextInt() - 1;
            sc.nextLine();
            if (numPaciente >= 0 && numPaciente < pacientes.size()) {
                return pacientes.get(numPaciente);
            } else {
                System.out.println("Número de paciente inválido.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites del ArrayList de pacientes.");
        }
        return null;
    }

    private static Medico escogerMedico() {
        if(medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
            return null;
        }
        try {
            System.out.println("Seleccione el médico: ");
            for (int i = 0; i < medicos.size(); i++) {
                System.out.println((i + 1) + " Nombre: " + medicos.get(i).getNombre() + " | Especialidad: " + medicos.get(i).getEspecialidad());
            }
            int numMedico = sc.nextInt() - 1;
            sc.nextLine();
            if (numMedico >= 0 && numMedico < medicos.size()) {
                return medicos.get(numMedico);
            } else {
                System.out.println("Número de médico inválido.");
                return null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            sc.nextLine();
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites del ArrayList de médicos.");
            return null;
        }
    }

    private static int obtenerNumeroDeCita() {
        return contadorCitas;
    }

    private static void mostrarCitas() {
        for (int i = 0; i < citas.size(); i++) {
            System.out.println((i + 1) + " Cita: " + citas.get(i).toString());
        }
    }
    public static void anularCita() {
        try {
            if (citas.isEmpty()) {
                System.out.println("No hay citas.");
                return;
            }
            mostrarCitas();
            System.out.println("Dígame el número de la cita a anular: ");
            int numCita = sc.nextInt() - 1;
            sc.nextLine();
            if (numCita >= 0 && numCita < citas.size()) {
                citas.remove(numCita);
                System.out.println("Cita anulada");
            } else {
                System.out.println("Número de cita inválido.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            sc.nextLine();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites del ArrayList de citas.");
        }
    }
    public static void consultarCitasPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }
        Paciente paciente = escogerPaciente();
        if (paciente == null) {
            System.out.println("Paciente no encontrado. Intente de nuevo.");
            return;
        }
        boolean citasEncontradas = false;
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getPaciente().equals(paciente)) {
                if (!citasEncontradas) {
                    citasEncontradas = true;
                    System.out.println("Citas del paciente " + paciente.getNombre() + ":");
                }
                System.out.println((i + 1) + " Cita: " + citas.get(i).toString());
                System.out.println("Desea ver los diagnosticos del paciente? (s/n)");
                String decision = sc.nextLine();
                if (decision.equalsIgnoreCase("s")) {
                    System.out.println("Diagnostico: " + diagnosticos.get(i));
                }
            }
            if (!citasEncontradas) {
                System.out.println("No hay citas registradas para ese paciente.");
            }
        }
    }

    public static void consultarCitasMedico() {
        if (medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
            return;
        }
        Medico medico = escogerMedico();
        if (medico == null) {
            System.out.println("Médico no encontrado. Intente de nuevo.");
            return;
        }

        boolean citasEncontradas = false;
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getMedico().equals(medico)) {
                if (!citasEncontradas) {
                    citasEncontradas = true;
                    System.out.println("Citas del médico " + medico.getNombre() + ":");
                }
                System.out.println((i + 1) + " Cita: " + citas.get(i).toString());
            }
        }
        if (!citasEncontradas) {
            System.out.println("No hay citas registradas para ese médico.");
        }
    }

}
