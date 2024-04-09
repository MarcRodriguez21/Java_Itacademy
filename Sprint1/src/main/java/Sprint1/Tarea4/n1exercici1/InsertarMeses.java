package Sprint1.Tarea4.n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertarMeses {

    static{
        meses = new ArrayList<>();
        crearmeses();
    }
    private static final List<String> meses;

    private static void crearmeses(){
        meses.addAll(List.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"));

    }

    public static List<String> getMeses() {
        return meses;

    }


}
