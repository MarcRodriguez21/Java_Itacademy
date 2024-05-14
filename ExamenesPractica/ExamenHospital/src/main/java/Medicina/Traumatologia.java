package Medicina;

public class Traumatologia extends Medico{

    public Traumatologia(String nombre, String especialidad, TipoConsulta tipoConsulta) {
        super(nombre, especialidad, tipoConsulta);
    }

    @Override
    public String diagnostico(){
        return "Se ha hecho una radiografía.";
    }
}
