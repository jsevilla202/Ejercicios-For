package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Nombramos la variable como número entero:
		 * n: Es un contador, en este caso cuenta dentro del bucle "for" las veces que ha salido un número par. Se inicializa a 0
		 */
		int n = 0;
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 2 ( ya que es el primero número par ) y la nombramos como número entero
		 * - No se parará hasta llegar al número 200
		 * - Suma 2 a la variable "i" cada vuelta
		 */
		for(int i=2; i <= 200; i=i+2) {
			//Sumamos 1 por cada número par
			n++;
		}
		//Mostramos la cantidad de números pares que hay en el rango
		System.out.println("hay un total de "+n+" números pares en el rango de 1 a 200");
	}

}
