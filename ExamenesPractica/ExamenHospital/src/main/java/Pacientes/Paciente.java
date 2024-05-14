package Pacientes;

import Hospital.Cita;

import java.util.ArrayList;

public class Paciente {

    private String nombre;
    private String id;
    private static final String numeroHospital = "0098766H";
    private Cita[] historialCitas;
    private ArrayList<String> diagnosticos = new ArrayList<String>();


    public Paciente(String nombre, String id, String numeroHospital, ArrayList<String> diagnosticos) {
        this.nombre = nombre;
        this.id = id;
        this.diagnosticos = diagnosticos;
    }


    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }


    public Cita[] getHistorialCitas() {
        return historialCitas;
    }

    public String getNumeroHospital() {
        return numeroHospital;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHistorialCitas(Cita[] historialCitas) {
        this.historialCitas = historialCitas;
    }

    public void setDiagnosticos(ArrayList<String> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public ArrayList<String> getDiagnosticos() {
        return diagnosticos;
    }

    @Override
    public String toString() {
        return
                "Nombre = " + nombre + '\'' +
                ", ID = " + id;
    }


}
