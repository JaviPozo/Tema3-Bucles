package Tema3Bucles;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// Definimos las variables
		int num; // Es el número introducido por el usuario
		double random = Math.random() * 99; // Utilizamos este tipo de math para sacar un número random

		// Creamos el Scann er para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();

		// Introduciremos un número y si el número es mayor al random se ha pasado y si
		// es menor se ha quedado corto
		while (num != (int) random) {
			if (num > (int) random) {
				System.out.println("Te has pasado.");
			} else {
				System.out.println("Te has quedado corto.");
			}
			System.out.println("Introduzca otro número: ");
			num = sc.nextInt();
		}
		System.out.println("Número encontrado");
		
		// Cerramos el Scanner
		sc.close();
	}

}
