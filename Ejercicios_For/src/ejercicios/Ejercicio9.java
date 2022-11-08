package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Número indicado por el usuario que indica hasta donde contar. Se inicializa a 0
		 * primo: Contador de restos iguales a 0
		 */
		int n=0;
		boolean primo = true;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos la función del programa al usuario
		System.out.println("El programa le va a pedir un número y dirá si es primo o no");
		//Pedimos que inserte un número
		System.out.print("Inserte un número, por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "n"
		n = sc.nextInt();
		
		//Si el número es negativo, no puede tener factorial, por lo que comprobamos que no lo sea
		if(n>=0) {
			/*
			 * En el bucle "for":
			 * - Inicializamos la variable "i" a 1
			 * - No se parará hasta que la variable "i" sea igual a la variable "n"
			 * - Suma 1 a la variable "i" cada vuelta
			 */
			for(int i = 1, k = 0; i!=n;i++) {
				//Si el resto del número introducido entre el contador es 0, se le suma 1 a la variable "k"
				if(n%i==0) {
					k++;
					//Si la variable "k" llega a 3, ya no es primo por lo que nombramos la variable "primo" falsa y salimos del bucle con break
					if(k>=3) {
						primo = false;
						break;
					}
				}
			}
			
			//Si la variable "primo" es false, no es un número primo, y si es true, si lo es
			System.out.println(primo==false?"Su número no es primo":"Su número es primo");
		}
		//Si lo es, mandamos un mensaje de error
		else {
			System.out.println("ERROR: No se puede calcular si tiene primo o no de un número negativo");
		}
		
		//cerramos el scanner
		sc.close();

	}

}
