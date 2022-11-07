package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Número indicado por el usuario que indica hasta donde contar. Se inicializa a 0
		 * factorial: Factorial creado en el bucle
		 */
		int n = 0, factorial;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos la función del programa al usuario
		System.out.println("El programa le va a pedir un número y este calculará su factorial");
		//Pedimos que inserte un número
		System.out.print("Inserte un número para calcular el factorial, por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n"
		n = sc.nextInt();

		//Si el número es negativo, no puede tener factorial, por lo que comprobamos que no lo sea
		if(n>=0) {
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "factorial" a 1
			 * - No se parará hasta que el número introducido llegue a 0
			 * - Resta 1 a la variable "n" cada vuelta
			 * - El valor de la variable "factorial" va cambiando, siendo esta multiplicada por la nueva variable "n" cada vez
			 */
			for(factorial = 1; n!=0; n=n-1) {
				factorial = factorial*n;
			}
			//Mostramos el resultado por consola
			System.out.println("El factorial del número introducido es: "+factorial);
		}
		//Si lo es, mandamos un mensaje de error
		else {
			System.out.println("ERROR: No se puede calcular el factorial de un número negativo");
		}
		
		//cerramos el scanner
		sc.close();
		
		

	}

}
