package Tema3Bucles;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// Defimos las variables
		double mediaNum = 0; // Es la media de los número cuando el bucle acaba
		int num; // Es el número que introduce el número
		int suma = 0, // Es la suma de todos los número introducidos por el usuario
				contador = 0; // Es el contador de los número introducidos

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();

		// Si el número o los números introducidos son positivos entonces hasta que el
		// usuario no introduzca un número negativo no se detendria, cuando el usuario
		// si introduzca el número negativo, si se detendrá
		while (num >= 0) {
			suma += num;
			contador++;
			System.out.print("Introduzca un número: ");
			num = sc.nextInt();

		}
		mediaNum = suma / contador;
		System.out.print("La media de los número introducidos son: " + mediaNum);

		// Cerramos el Scanner
		sc.close();
	}

}
