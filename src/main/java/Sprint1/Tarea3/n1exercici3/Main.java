package Sprint1.Tarea3.n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int numIntentos = 1;
        int numMaxIntentos = 10;
        int numPuntos = 0;
        //String rutaAcceso = "C:/Users/marcr/Downloads/countries.txt";
        String rutaAcceso = System.getProperty("user.dir") + "/countries.txt";
        String rutaAccesoFinal = System.getProperty("user.dir") + "/classificació.txt";
        File archivo = new File(rutaAcceso);
        File archivoFinal = new File(rutaAccesoFinal);


        HashMap<String, String> country_capital = new HashMap<String, String>();

        try (FileReader lector = new FileReader(archivo)) {
            BufferedReader lectorLineas = new BufferedReader(lector);
            String lineas;
            while ((lineas = lectorLineas.readLine()) != null) {
                String[] pais_capital = lineas.split(" ");
                country_capital.put(pais_capital[0], pais_capital[1]);
            }

            lectorLineas.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException g) {
            System.out.println(g.getMessage());
        }

        System.out.println("Dígame su nombre de Usuario");
        String user = sc.nextLine();
        while (numIntentos <= numMaxIntentos) {
            int indiceAleatorio = (int) (Math.random()*country_capital.size());

            Object[] paises = country_capital.keySet().toArray();
            String paisAleatorio = (String) paises[indiceAleatorio];
            System.out.println("Dígame la capital de " + paisAleatorio + ".");
            String respuesta = sc.nextLine();
            Object[] capitales = country_capital.values().toArray();
            String capitalAleatoria = (String) capitales[indiceAleatorio];
            if (respuesta.contentEquals(capitalAleatoria)) {
                numPuntos++;
                System.out.println("Has acertado! Tienes " + numPuntos + " puntos.");
                System.out.println("Te quedan: " + (numMaxIntentos - numIntentos) + " intentos.");
            } else {
                System.out.println("Has fallado! Te quedan: " + (numMaxIntentos - numIntentos) + " intentos.");
                System.out.println("Tienes " + numPuntos + " puntos.");
                System.out.println("La capital era: " + capitalAleatoria + ".");
            }
            numIntentos++;
        }
        String mensajeFinal = "Muy bien! " + user + "! Has hecho: " + numPuntos + " puntos.";
        System.out.println(mensajeFinal);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoFinal, true))) {
            writer.write(mensajeFinal);
            writer.newLine();

        }catch(IOException e) {
            e.printStackTrace();
        }


    }
}



