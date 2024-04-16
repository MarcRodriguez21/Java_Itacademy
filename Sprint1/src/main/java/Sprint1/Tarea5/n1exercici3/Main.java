package Sprint1.Tarea5.n1exercici3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args)  {
        System.out.println("Dígame la ruta del directorio que quiere buscar:");
        String directorio = a.nextLine();
        ArrayList<String> archivostxt = buscarDirectorio(directorio, 0);
        String archivotxt = archivostxt.toString();


        String rutaProyecto = System.getProperty("user.dir");
        String rutaAccesoFinal = rutaProyecto + "/listaArchivos.txt";

        File archivo = new File(rutaAccesoFinal);
        try(FileWriter fileWriter = new FileWriter(archivo, true)){
            for (String linea : archivostxt) {
                fileWriter.write(linea + "\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
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
                    archivostxt.addAll(buscarDirectorio(file.getAbsolutePath(), nivel + 1));
                }else{
                    String lineaArchivo = "--------- >" + " Archivo " + file.getName() + " Última modificación " + fecha.toString();
                    archivostxt.add(lineaArchivo + "\n");


                }
            }
        }else{
            System.out.println("El directorio no se encuentra o no existe");
        }
        return archivostxt;
    }
}