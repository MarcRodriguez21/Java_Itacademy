package Sprint1.Tarea5.n1exercici1;

import java.io.File;
import java.util.Scanner;
public class Main  {
    //static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //System.out.println("Dígame la ruta del directorio que quiere buscar:");
        String directorio = args[0];
        buscarDirectorio(directorio);
    }

    public static void buscarDirectorio(String directorio) {

        File dir = new File(directorio);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("El directorio no se encuentra o no existe.");
        }

    }

}
