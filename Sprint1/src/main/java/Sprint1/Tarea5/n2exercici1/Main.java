package Sprint1.Tarea5.n2exercici1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args)  {

        Properties propiedades = cargarPropiedades();

        String directorioALeer = propiedades.getProperty("directorio_a_leer");
        String nombreDirectorioTxt = propiedades.getProperty("nombre_directorio_txt");

        ArrayList<String> archivostxt = buscarDirectorio(directorioALeer, 0);

        String rutaAccesoFinal = nombreDirectorioTxt;
        File archivo = new File(rutaAccesoFinal);

        try (FileWriter fileWriter = new FileWriter(archivo, true)) {
            for (String linea : archivostxt) {
                fileWriter.write(linea + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Properties cargarPropiedades() {
        Properties propiedades = new Properties();
        try {
            propiedades.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return propiedades;
    }

    public static ArrayList<String> buscarDirectorio(String directorio, int nivel) {
        File dir = new File(directorio);
        ArrayList<String> archivostxt = new ArrayList<>();
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files){
                Date fecha = new Date(file.lastModified());
                if(file.isDirectory()){
                    String lineaCarpeta = "*** " + " Carpeta " + file.getName() + " Última modificación " + fecha.toString() + "/";
                    archivostxt.add(lineaCarpeta + "\n");
                    // System.out.println(lineaCarpeta);
                    archivostxt.addAll(buscarDirectorio(file.getAbsolutePath(), nivel + 1));
                }else{
                    String lineaArchivo = "--------- >" + " Archivo " + file.getName() + " Última modificación " + fecha.toString();
                    // System.out.println(lineaArchivo);
                    archivostxt.add(lineaArchivo + "\n");

                }
            }
        }else{
            System.out.println("El directorio no se encuentra o no existe");
        }
        return archivostxt;
    }
}

