package Medicina;

public class General extends Medico{

    public General(String nombre, String especialidad, TipoConsulta tipoConsulta) {
        super(nombre, especialidad, tipoConsulta);
    }

    @Override
    public String diagnostico(){
        return "Diagnostico general";
    }

}
