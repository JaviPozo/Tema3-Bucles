package Tema3Bucles;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// Definimos las variables
		int num = 0; //
		int suma = 0; //

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca los números
		System.out.print("Introduzca una serie de números: ");
		num = sc.nextInt();

		// Comprobamos que el o los número introducidos por el usuario estan dentro del
		// rango
		while (num >= 0) { // Si el número es negativo se para el bucle y se realiza la suma de los número
							// introducidos
			suma += num;
			num = sc.nextInt();

		}
		System.out.println(suma);
		sc.close();

	}

}
