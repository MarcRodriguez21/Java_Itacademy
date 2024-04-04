package Sprint1.Tarea4.n1exercici3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OutOfBounds {
    public static void main(String[] args) {


    }

    public static void ErrorTest(){

        throw new ArrayIndexOutOfBoundsException();
    }
    /*public static void ErrorTest1() {
        int valor = 0;
        try {
            int[] listaNum = {0, 1, 2, 3};
            valor = listaNum[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error OutOfBounds " + e.getMessage());

        }
    }*/
}
