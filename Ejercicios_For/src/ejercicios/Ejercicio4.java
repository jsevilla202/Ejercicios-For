package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Número indicado por el usuario que indica hasta donde contar. Se inicializa a 0
		 * k: Es un contador, en este caso cuenta dentro del bucle "for" las veces que ha salido un número multiplo de 3. Se inicializa a 0
		 */
		int n, k = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario y le pedimos que introduzca un número
		System.out.print("Este programa indicará cuantos multiplos de 3 hay desde el 1 hasta el número indicado: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		n = sc.nextInt();
		
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 0 y la nombramos como número entero
		 * - No se parará hasta llegar al número indicado por el usuario
		 * - Suma 3 a la variable "i" cada vuelta
		 * - Suma 1 a la variable "k" cada vuelta
		 */
		for(int i=1; i <= n; i++) {
			if(i%3==0) {
				k++;
			}
		}
		
		//Mostramos la cantidad de números pares que hay en el rango
		System.out.println("hay un total de "+k+" números multiplos de 3 en el rango de 1 a "+n);
		
		//cerramos el Scanner
		sc.close();

	}

}
