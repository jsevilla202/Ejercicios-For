package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Número indicado por el usuario que indica hasta donde contar. Se inicializa a 0
		 */
		int n = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y le pedimos que introduzca un número
		System.out.print("Con este programa aprenderemos a contar, introduzca a continuación un número y contará desde el 1 hasta el número indicado: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		n = sc.nextInt();
		
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 1 y la nombramos como número entero
		 * - No se parará hasta llegar al número indicado por el usuario
		 * - Suma 1 en cada vuelta
		 */
		for(int i=1; i <= n; i++) {
			//Mostramos por consola el valor de la variable "i"
			System.out.println(i);
		}
		
		//cerramos el Scanner
		sc.close();

	}

}
