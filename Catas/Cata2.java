package Catas;

import java.util.Scanner;

public class Cata2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digame su nombre:");
		String nombre = sc.nextLine();
		System.out.println("Hola! " + nombre);
		System.out.println("Vamos a jugar al 'piedra, papel o tijeras'.");
		int numeroVidas = 5;
		int numeroPuntos = 0;
		while (numeroVidas <= 5 && numeroVidas > 0) {

			int numeroCPU = ((int) (Math.random() * 3)+1);
			System.out.println(numeroCPU);

			System.out.println("Dime que quieres: 1. Piedra, 2. Papel 3. Tijeras");
			int eleccion = sc.nextInt();
			if (eleccion < 1 || eleccion > 3) {
				System.out.println("Debes escoger una eleccion valida");
			} else {

				switch (numeroCPU) {
				case 1:
					System.out.println("Yo he elegido piedra.");
					if (eleccion == 1) {
						System.out.println("Hemos empatado");
					} else if (eleccion == 2) {
						System.out.println("Has ganado.");
						numeroPuntos++;
						System.out.println("Tienes " + numeroPuntos + " puntos.");
					} else if (eleccion == 3) {
						System.out.println("He ganado.");
						numeroVidas--;
						System.out.println("Te quedan " + numeroVidas + " vidas.");
					}
					break;
				case 2:
					System.out.println("Yo he elegido papel.");
					if (eleccion == 1) {
						System.out.println("He ganado");
						numeroVidas--;
						System.out.println("Te quedan " + numeroVidas + " vidas.");
					} else if (eleccion == 2) {
						System.out.println("Hemos empatado.");
					} else if (eleccion == 3) {
						System.out.println("Has ganado.");
						numeroPuntos++;
						System.out.println("Tienes " + numeroPuntos + " puntos.");
					}
					break;
				case 3:
					System.out.println("Yo he elegido tijeras.");
					if (eleccion == 1) {
						System.out.println("Has ganado.");
						numeroPuntos++;
						System.out.println("Tienes " + numeroPuntos + " puntos.");
					} else if (eleccion == 2) {
						System.out.println("He ganado.");
						numeroVidas--;
						System.out.println("Te quedan " + numeroVidas + " vidas.");
					} else if (eleccion == 3) {
						System.out.println("Hemos empatado.");
					}
					break;
				}

			}

		}

		System.out.println("Muy bien " + nombre + "! Has hecho:" + numeroPuntos + " puntos.");

	}

}
