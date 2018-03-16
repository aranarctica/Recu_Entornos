/**
 * 
 * 
 * Creamos la clase de testeo para probar las clases de Matemáticas
 * 
 */

package Operaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatematicasTest {
	
	
	/**
	 * 
	 * En este testeo se prueba el metodo de suma
	 * 
	 */

	@Test
	public void suma() {
		int a = 5;
		int b = 4;
		
		assertNull(a + b);
		
		
		
	}
	
	/**
	 * 
	 * En este testeo se prueba el metodo mayor
	 * 
	 */
	@Test
	public void mayor(){
		int a = 4;
		int b = 8;
		
		assertTrue( a > b);
		
	}
	
	/**
	 * 
	 * En este metodo se prueba el testeo de getSumas
	 * 
	 */
	
	@Test
	public void getSumas(){
		
		
		this.suma();
		
	}

}
