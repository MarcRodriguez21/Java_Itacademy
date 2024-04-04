package n1exercici1;

import Sprint1.Tarea4.n1exercici1.InsertarMeses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Month_test {


    List<String> meses = new ArrayList<String>();


    @BeforeEach
    public void iniciar(){
        meses.addAll(InsertarMeses.getMeses());
    }
    @DisplayName("La lista deberia tener 12 meses.")
    @Test
    void monthSize(){
        Assertions.assertEquals(12,meses.size());
    }
    @DisplayName("El array no deberia ser nulo.")
    @Test
    public void testNotNull(){
        Assertions.assertNotNull(meses);
    }
    @DisplayName("En el mes 8 deberia estar agosto")
    @Test
    public void agosto(){
        Assertions.assertEquals("agosto",meses.get(7));
    }


}
