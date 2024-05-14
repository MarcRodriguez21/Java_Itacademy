package Hospital;

import Medicina.Medico;
import Pacientes.Paciente;

public class Cita {

    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;
    private static int numCita;

    private int numCitaIncremental = 0;

    public Cita(Paciente paciente, Medico medico, String fecha, String hora, int numCita) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.numCita = numCita + numCitaIncremental;
        numCitaIncremental++;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }


    public String getFecha() {
        return fecha;
    }


    public String getHora() {
        return hora;
    }


    public int getNumCita() {
        return numCita;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }


    public void setNumCita(int numCita) {
        this.numCita = numCita;
    }


    @Override
    public String toString() {
        return "Cita = " + numCita + ", Paciente = " + paciente + ", Medico = " + medico + ", Fecha de la cita = " + fecha + ", Hora de la cita = " + hora;
    }
}
