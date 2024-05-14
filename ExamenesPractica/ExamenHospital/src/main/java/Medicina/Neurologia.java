package Medicina;

public class Neurologia extends Medico {

    public Neurologia(String nombre, String especialidad, TipoConsulta tipoConsulta) {
        super(nombre, especialidad, tipoConsulta);
    }

    @Override
    public String diagnostico() {
        return "Se ha hecho una tomografía.";
    }
}
