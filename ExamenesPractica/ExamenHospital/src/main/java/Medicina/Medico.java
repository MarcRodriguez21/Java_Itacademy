package Medicina;

public abstract class Medico {

    private String nombre;
    private String especialidad;
    private TipoConsulta tipoConsulta;

    public Medico(String nombre, String especialidad, TipoConsulta tipoConsulta) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.tipoConsulta = tipoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public abstract String diagnostico();

    public String toString() {
        return "Nombre: " + getNombre() + " | Especialidad: " + getEspecialidad() + " | Tipo de consulta: " + getTipoConsulta();
    }
}
