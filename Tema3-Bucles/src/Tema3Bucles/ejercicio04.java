package Tema3Bucles;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		// Definimos las variables
		int num = 0; // Es el número que introduce el usuario
		int division; // Es para hallar si es par o no

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el número y veremos si es par o impar: ");
		num = sc.nextInt();

		// Si el número o los números introducidos son distintos del cero entonces hasta
		// que el
		// usuario no introduzca un cero no se detendria, cuando el usuario
		// si introduzca el cero, si se detendrá
		while (num != 0) {
			division = num % 2; // Hallamos el resto de la división

			if (division == 0) { // Si el resto es cero el número es par
				System.out.println("El número es par");
			} else { // Si no, no
				System.out.println("El número es impar");

			}
			System.out.println("Introduzca el número y veremos si es par o impar: ");
			num = sc.nextInt();
		}
		// Cerramos el Scanner
		sc.close();
	}

}
