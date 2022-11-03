package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Nombramos la variable como número entero:
		 * n: Es un contador, en este caso cuenta dentro del bucle "for" las veces que ha salido un número par. Se inicializa a 0
		 */
		int n = 0;
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 0 y la nombramos como número entero
		 * - No se parará hasta llegar a 100
		 * - Suma 7 a la variable "i" cada vuelta
		 */
		for(int i=0; i <= 100; i=i+7) {
			//Sumamos 1 por cada número par
			n++;
		}
		
		//Mostramos la cantidad de números pares que hay en el rango
		System.out.println("hay un total de "+n+" números multiplos de 7 en el rango de 1 a 100");

	}

}
