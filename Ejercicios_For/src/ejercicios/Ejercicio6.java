package ejercicios;

public class Ejercicio6 {
	public static void main(String[] args) {
		/*
		 * Nombramos a la variable como número entero:
		 * n: Contador del bucle. Se inicializa a 1
		 * suma: Suma de los números impares. Se inicializa a 0
		 */
		int n = 1, suma = 0;
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 0 y la nombramos como número entero
		 * - No se parará hasta llegar a los 10 primeros números impares
		 * - Suma 1 a la variable "i" cada vuelta
		 */
		for(int i=1; n <= 10; i=i+2,n++) {
				suma = suma +i;
		}
		//Mostramos por consola el resultado
		System.out.println("La suma total de los 10 primeros números impares es: "+suma);
	}
}
