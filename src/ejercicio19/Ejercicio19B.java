/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 19:
 * b) Mover el código que imprime la cadena al revés a un método
 * static void imprimirReversa(String cadena)
 *    
 */

package ejercicio19;

import unpaz.ayp3.Consola;

public class Ejercicio19B {

	public static void main(String[] args) 
	{
		String cadena = Consola.pedirTexto("Ingrese un texto");
		
		imprimirReversa(cadena);
	}
	
	public static void imprimirReversa(String cadena)
	{
		for(int i=cadena.length()-1; i>=0; i--)
		{
			System.out.print(cadena.charAt(i));
		}
	}
}
