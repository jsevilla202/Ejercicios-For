package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 2 ( ya que es el primero número par ) y la nombramos como número entero
		 * - No se parará hasta llegar al número 200
		 * - Suma 2 a la variable "i" cada vuelta
		 */
		for(int i=2; i <= 200; i=i+2) {
			//Mostramos los números pares que hay en el rango
			System.out.println(i);
		}
	}

}
