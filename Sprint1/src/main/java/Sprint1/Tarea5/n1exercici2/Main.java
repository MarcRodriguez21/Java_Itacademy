package Sprint1.Tarea5.n1exercici2;

import java.io.File;
import java.util.Date;
import java.util.Scanner;


public class Main {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dígame la ruta del directorio que quiere buscar:");
        String directorio = a.nextLine();
        buscarDirectorio(directorio, 0);
    }

    public static void buscarDirectorio(String directorio, int nivel) {
        File dir = new File(directorio);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files){
                Date fecha = new Date(file.lastModified());
                if(file.isDirectory()){
                    System.out.println("*** " + " Carpeta " + file.getName() + " Última modificación " + fecha.toString() + "/");
                    buscarDirectorio(file.getAbsolutePath(), nivel + 1);
                }else{
                    System.out.println("--------- >" + " Archivo " + file.getName() + " Última modificación " + fecha.toString());
                }
            }
        }else{
            System.out.println("El directorio no se encuentra o no existe");
        }
    }
}

