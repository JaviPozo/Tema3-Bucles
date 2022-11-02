package Tema3Bucles;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		// Definimos las variables
		int contador = 1;
		int sumaPositivos = 0; // Guardará la suma de los número positivos
		double sumaNegativos = 0; // Esta sirve para la media
		double cuentaNegativos = 0; // Se necitará para saber cuantos num negativos hoy para la media
		double mediaNegativos = 0;
		int cuentaCeros = 0; // Contará la cantidad de ceros
		int num = 0; // Es el número introducido por el usuario

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		while (contador <= 10) {
			// Le pedimos al usuario que introduzca los númerosç
			System.out.println("Introduzca 10 números: ");
			num = sc.nextInt();

			if (num > 0) {
				// Si el número es positivo los añadimos a la suma
				sumaPositivos *= num;
			} else if (num < 0) {
				// Si el número es negativo lo añadimos a la suma y contamos cuantos números
				// negativos hay para poder hacer la media
				sumaNegativos += num;
				cuentaNegativos++;
				mediaNegativos = sumaNegativos / cuentaNegativos;
			} else {
				// Añadimos uno a la cuenta de los ceros
				cuentaCeros++;
			}
			contador++;
		}

		// Le pedimos al usuario que introduzca los númerosç
		System.out.println(sumaPositivos);
		System.out.println(mediaNegativos);
		System.out.println(cuentaCeros);

		// Cerramos el Scanner
		sc.close();

	}

}
