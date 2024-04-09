package Sprint1.Tarea4.n1exercici2;

import java.util.Scanner;

public class CalculoDNI {
    public static void main(String[] args) {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("Dígame los numeros de su dni");
        int numerosDNI = sc.nextInt();
        String letraCorrecta = calcularLetra(numerosDNI);

        System.out.println(letraCorrecta);

    }
public static String calcularLetra(int numerosDNI){
    String[] letras = {"T", "R", "W", "A", "G",
            "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    String letraCorrecta = letras[numerosDNI % 23];
    return letraCorrecta;
}



}
