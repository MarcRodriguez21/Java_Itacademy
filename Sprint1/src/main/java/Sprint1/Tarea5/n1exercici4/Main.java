//package Sprint1.Tarea5.n1exercici4;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args)  {
        System.out.println("Dígame la ruta del directorio que quiere buscar:");
        String directorio = a.nextLine();
        ArrayList<String> archivostxt = new ArrayList<>();
        archivostxt =buscarDirectorio(directorio, 0);
        String archivotxt = archivostxt.toString();


        String rutaAccesoFinal = "C:/Users/marcr/IdeaProjects/Java_Itacademy/src/main/java/Sprint1/Tarea5/n1exercici4/listaArchivos.txt";
        File archivo = new File(rutaAccesoFinal);
        try(FileWriter fileWriter = new FileWriter(archivo, true)){
            fileWriter.write(archivotxt);
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
                    System.out.println(lineaCarpeta);
                    archivostxt.addAll(buscarDirectorio(file.getAbsolutePath(), nivel + 1));
                }else{
                    String lineaArchivo = "--------- >" + " Archivo " + file.getName() + " Última modificación " + fecha.toString();
                    System.out.println(lineaArchivo);
                    archivostxt.add(lineaArchivo + "\n");
                    if(file.getName().endsWith(".txt")) {
                        System.out.println("Quieres leer el archivo " + file.getName() + "?");
                        String respuesta = a.nextLine();
                        if (respuesta.equals("si")) {
                            try (FileReader fileReader = new FileReader(file)) {
                                BufferedReader bufferedReader = new BufferedReader(fileReader);
                                String line;
                                while ((line = bufferedReader.readLine()) != null) {
                                    System.out.println(line);
                                }

                            } catch (IOException e) {
                                System.out.println(e.getMessage());
                            }
                        }else if (respuesta.equals("no")) {
                            System.out.println("Vale, no lees el archivo");
                        }
                    }
                }
            }
        }else{
            System.out.println("El directorio no se encuentra o no existe");
        }
        return archivostxt;
    }

}
