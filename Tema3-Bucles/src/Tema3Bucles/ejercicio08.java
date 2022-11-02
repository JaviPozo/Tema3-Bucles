package Tema3Bucles;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// Definimos las variables
		double altura;
		double alturaMax = 0;

		// Creamos Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca las alturas de los árboles
		System.out.println("Introduzca la altura de los árboles (en centímetros): ");
		altura = sc.nextDouble();
		
		while (altura != -1) {

			if (altura > alturaMax) {
				alturaMax = altura;
			}
			System.out.println("Introduzca la altura de los árboles (en centímetros): ");
			altura = sc.nextDouble();
		}

		System.out.println("La mayor altura es: " + alturaMax);
		sc.close();
	}

}
