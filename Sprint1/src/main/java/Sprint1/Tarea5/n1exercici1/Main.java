package Sprint1.Tarea5.n1exercici1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporcione la ruta del directorio como argumento.");
        } else {
            String directorio = args[0];
            buscarDirectorio(directorio);
        }
    }

    private static void buscarDirectorio(String directorio) {
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