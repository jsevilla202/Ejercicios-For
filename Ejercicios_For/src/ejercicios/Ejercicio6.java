package ejercicios;

public class Ejercicio6 {
	public static void main(String[] args) {
		int n = 0, suma = 0;
		/*
		 * En el bucle "for":
		 * - Inicializamos la variable "i" a 2 ( ya que es el primero número par ) y la nombramos como número entero
		 * - No se parará hasta llegar al número 200
		 * - Suma 2 a la variable "i" cada vuelta
		 */
		for(int i=0; n <= 10; i++) {
			if(i%2!=0) {
				n++;
				suma = suma +i;
			}
		}
		System.out.println("La suma total de los 10 primeros números impares es: "+suma);
	}
}
