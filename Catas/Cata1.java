package Catas;

import java.util.Scanner;

public class Cata1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String abecedario = "ABCDFHIJKLMNOPQRSTUVWXYZABCDFHIJKLM";
		
		
		
		System.out.println("Dígame una frase y se la codificaré en ROT13");
		String codigo = sc.nextLine();
		codigo = codigo.toUpperCase();
		//codigo.replace(" ","");
		
		
		
		for(int i = 0; i < codigo.length(); i++) {
			
			char letra = codigo.charAt(i);
			int indiceOriginal = abecedario.indexOf(letra);
			int indiceCifrado = (indiceOriginal + 13) % abecedario.length();
			System.out.println(abecedario.charAt(indiceCifrado));
			
			
		
				  }
			 }
	
	
	
	 /*for( int j = 0; j < abecedario.length(); j++) {
	 if(codigo.charAt(i) == abecedario.charAt(j)) {
		 System.out.println( abecedario.charAt(j + 13));*/
		}




