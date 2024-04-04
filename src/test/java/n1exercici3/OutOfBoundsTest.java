package n1exercici3;

import Sprint1.Tarea4.n1exercici3.OutOfBounds;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OutOfBoundsTest {
    @Test
    @DisplayName("Probando ArrayIndexOutOfBoundsException")
    public void ArrayIndexOutOfBoundsExceptionTest(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> OutOfBounds.ErrorTest());

    }
}
