package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Número indicado por el usuario que indica hasta donde contar. Se inicializa a 0
		 * suma: Suma de los números capurados en la variable "n". Se inicializa a 0
		 */
		int n, suma = 0;

		//Creamos un Scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamosd el programa al usuario y su funcionamiento
		System.out.println("A continuación se le va a pedir 10 números y el programa calculara la media");
		
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 0 y la nombramos como número entero
		 * - No se parará hasta llegar a 10
		 * - Suma 1 en cada vuelta
		 */
		for(int i = 0; i <= 10; i++) {
			
			//Pedimos al usuario que inserte un número
			System.out.print("Inserte un número: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n"
			n = sc.nextInt();
			
			//Igualamos la variable "suma" a la suma de esta misma con el número capturado en la variable "n"
			suma = suma + n;
		}
		//Mostramos la media 
		System.out.println("La media de los números es: "+ suma/10);
		sc.close();
	}

}
