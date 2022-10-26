package Tema3Bucles;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// Definimos las variables
		int num; // Es para indicar el número que introduce el usuario
		int contador = 0; // La cantidad de número introducidos por el usuario

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una serie de numeros
		System.out.print("Introduzca una serie de números: ");
		num = sc.nextInt();

		// Si el número o los números introducidos son positivos entonces hasta que el
		// usuario no introduzca un número negativo no se detendria, cuando el usuario
		// si introduzca el número negativo, si se detendrá
		while (num>0) {
			contador++;
			System.out.print("Introduzca los número otra vez: ");
			num = sc.nextInt();
		}
		System.out.print("La suma total es: " +contador);
		sc.close();
		

	}

}
