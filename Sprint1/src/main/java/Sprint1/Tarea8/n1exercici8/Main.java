package Sprint1.Tarea8.n1exercici8;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Reverse reverser = str -> new StringBuilder(str).reverse().toString();
        System.out.println("Dígame el String a invertir:");
        String original = sc.nextLine();

        String reversed = reverser.reverse(original);
        System.out.println("El String invertido es: " + reversed);
    }
}
