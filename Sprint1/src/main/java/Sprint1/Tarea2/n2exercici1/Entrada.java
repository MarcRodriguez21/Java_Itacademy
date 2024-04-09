package Sprint1.Tarea2.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    private static Scanner sc = new Scanner(System.in);

    public static byte leerByte(String mensaje) {
        System.out.println(mensaje);
        byte num = 0;
        boolean ok = false;
        while (!ok) {
            try {
                num = sc.nextByte();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un valor numérico 'byte'.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static int leerInt(String mensaje) {

        System.out.println(mensaje);
        int num = 0;
        boolean ok = false;
        while (!ok) {
            try {
                num = sc.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un valor numérico 'int'.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static float leerFloat(String mensaje) {

        System.out.println(mensaje);
        float num = 0.0f;
        boolean ok = false;
        while (!ok) {
            try {
                num = sc.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un valor numérico 'float'.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static double leerDouble(String mensaje) {

        System.out.println(mensaje);
        double num = 0.0;
        boolean ok = false;
        while (!ok) {
            try {
                num = sc.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un valor numérico 'double'.");
                sc.nextLine();
            }
        }
        return num;
    }

    public static char leerChar(String mensaje) {
        System.out.println(mensaje);
        char charLeer = ' ';
        boolean ok = false;
        while (!ok) {
            try {
                charLeer = sc.next().charAt(0);
                ok = true;
            } catch (Exception e) {
                System.out.println("Error. Introduce un valor 'char' válido.");
                sc.nextLine();
            }
        }
        return charLeer;
    }

    public static String leerString(String mensaje) {
        System.out.println(mensaje);
        String stringLeer = "";
        boolean ok = false;
        while (!ok) {
            try {
                stringLeer = sc.next();
                if(stringLeer.isEmpty()){
                    throw new Exception();
                }else{
                    sc.nextLine();
                    ok = true;
                }
            } catch (Exception e) {
                System.out.println("Error. Introduce un valor 'string'.");
                sc.nextLine();
            }
        }
        return stringLeer;
    }

    public static boolean leerSiONo(String mensaje) {

        boolean booleanLeer = false;
        boolean ok = false;
        String respuesta = "";

        while (!ok) {
            System.out.println(mensaje);
            respuesta = sc.nextLine();
            try {
                if (respuesta.equalsIgnoreCase("s")) {
                    ok = true;
                    booleanLeer = true;
                } else if (respuesta.equalsIgnoreCase("n")) {
                    ok = true;
                    booleanLeer = false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Error. Introduce 's' o 'n'.");
            }
        }

        return booleanLeer;
    }
}
