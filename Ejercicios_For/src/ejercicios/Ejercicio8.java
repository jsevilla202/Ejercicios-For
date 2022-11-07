package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Nota introducida.
		 * suspenso: Contador de suspensos introducidos. Se inicializa a 0
		 */
		int n, suspenso = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos la función del programa al usuario
		System.out.println("A continuación se le pediran 10 notas y el programa dirá cuantas estan suspensas");
		
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 0
		 * - No se parará hasta que la variable "i" llegue a 11
		 * - Resta 1 a la variable "n" cada vuelta
		 * - El valor de la variable "factorial" va cambiando, siendo esta multiplicada por la nueva variable "n" cada vez
		 */
		for(int i=1; i<=10; i++) {
			System.out.print("Inserte una nota: ");
			n = sc.nextInt();
			if(n>=0) {
			if(n>=5) {
				continue;
			}
			else {
				suspenso++;
			}
		}
			else {
				System.out.println("ERROR: La nota no puede ser negativa");
			}
		}
		System.out.println("Hay un total de "+suspenso+" suspensos");
		sc.close();

	}

}
