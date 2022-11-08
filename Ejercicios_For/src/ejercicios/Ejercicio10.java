package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n1: Número menor indicado por el usuario
		 * n2: Número menor indicado por el usuario
		 */
		int n1, n2;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos la función del programa al usuario
		System.out.println("El programa le va a pedir dos números, el segundo DEBE de ser más grande que el primero "
				+ "y se mostrará los números desde el primero hasta el segundo");
		//Pedimos que inserte un número
		System.out.print("Inserte un número, por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n1"
		n1 = sc.nextInt();
		//Pedimos que inserte un número
		System.out.print("Inserte otro número, por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n2"
		n2 = sc.nextInt();
		
		//Si la variable "n2" es mayor que la avriable "n1", los ha introducido bien por lo que continuamos con el programa
		if(n2>n1) {
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "i" a n1
			 * - No se parará hasta que la variable "i" sea igual a la variable "n2" más 1 para que n2 salga en la lista
			 * - Suma 1 a la variable "i" cada vuelta
			 */
			for(int i = n1; i!=n2+1; i++) {
				//Mostramos por consola el valor de la variabl "i"
				System.out.println(i);
			}
		}
		//Si no lo es, mandamos un mensaje de error
		else {
			System.out.println(n1!=n2?"ERROR: El primer número es mayor que el segundo":"ERROR: El primer número es igual que el segundo");
		}
		
		//cerramos el scanner
		sc.close();

	}

}
