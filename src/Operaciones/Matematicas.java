/**
 * 
 * 
 * @author ik012982i9
 * Creamos la clase matemáticas para hacer una serie de operaciones en el paquete Operaciones
 * 
 */
package Operaciones;

/**
 * 
 * 
 * @author ik012982i9
 *
 */

public class Matematicas {

	/**
	 * Creamos el array sumas en privado y le introducimos su tamaño, en este
	 * caso de 50, luego creamos el contador de sumas para conocer la cantidad
	 * de operaciones realizadas
	 * 
	 * 
	 */

	private int[] sumas = new int[50];
	private int contadorSumas = 0;

	/**
	 * 
	 * @param a
	 *            Inicializamos la variable 'a' para realizar operaciones
	 *            aritméticas
	 * @param b
	 *            Inicializamos la variable 'b' para realizar operaciones
	 *            aritméticas
	 * @return retornamos la suma de las variables inicializadas anteriormente
	 */

	public int suma(int a, int b) {

		int suma = a + b;
		int contadorSumas = 0;
		sumas[contadorSumas] = suma;
		contadorSumas++;
		return suma;

	}

	/**
	 * 
	 * 
	 * @param a
	 *            Inicializamos la variable 'a' para compararla con la otra
	 *            variable
	 * @param b
	 *            Inicializamos la variable 'b' para compararla con la otra
	 *            variable
	 * @return retornamos si es verdadero 'true' o falso 'false' la afirmación
	 *         booleana
	 */
	public boolean mayor(int a, int b) {

		if (a > b) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 
	 * 
	 * @return Este es el getter del array de las sumas, que es lo que retorna
	 */
	public int[] getSumas() {
		return sumas;
	}

	/**
	 * 
	 * 
	 * @param sumas Este es el setter del  array de las sumas
	 */

	public void setSumas(int[] sumas) {
		this.sumas = sumas;
	}

	/**
	 * 
	 * @return Este es el getter del contador de sumas, que es lo que retorna
	 */

	public int getContadorSumas() {
		return contadorSumas;
	}
	
	/**
	 * 
	 * 
	 * @param contadorSumas Este es el setter del contador de las sumas
	 */

	public void setContadorSumas(int contadorSumas) {
		this.contadorSumas = contadorSumas;
	}

}
