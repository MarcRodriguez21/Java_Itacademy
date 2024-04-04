package n1exercici2;

import Sprint1.Tarea4.n1exercici2.CalculoDNI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DNItest {

    @ParameterizedTest
    @DisplayName("Prueba letras DNI")
    @CsvSource({
            "23414620,E", "12220816,L", "34703044,T", "59282053,J", "28166325,L", "53319165,J", "40862597,S",
            "42739626,Z", "96958784,F", "34178118,A",
    })

    void calcularLetraTest(int numeroDNI, String letraEsperada){
        String letraCalculada = CalculoDNI.calcularLetra(numeroDNI);
        Assertions.assertEquals(letraEsperada, letraCalculada);
    }
}
