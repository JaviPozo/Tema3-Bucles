package Tema3Bucles;

import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		// Definimos las variables
		int num;
		double sumaEdades = 0;
		double contador = 0;
		int contadorMayores = 0;
		double media = 0;

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la edad de los alumnos y cuantos hay.
		System.out.println("¿Que edad tiene?: ");
		num = sc.nextInt();

		// Comprobamos que los número introducidos son positivos, en caso de que algún
		// número sea negativo, acabara el bucle.
		while (num >= 0) {
			sumaEdades += num; // Para calcular las eadades introducidas.
			contador++; // OPara contar el número de lumnos introducidos.
			media = sumaEdades / contador; // Para calcular la media de edades introducidas.

			// Si la edad es mayor o igual de 18 es mayor de edad
			if (num >= 18) {
				contadorMayores++;
			}
			
			// Le volvemos a pedir que introduzca las edades.
			System.out.println("¿Que edad tiene?: ");
			num = sc.nextInt();
		}
		
		// Mostramos el resultado de cada operación.
		System.out.println("La suma de las edades es:  " + sumaEdades);
		System.out.println("La media de todas la edades es: " + media);
		System.out.println("El número de alumnos es: " + contador);
		System.out.println("Hay " + contadorMayores + " mayores de edad.");

		sc.close();
	}
}
