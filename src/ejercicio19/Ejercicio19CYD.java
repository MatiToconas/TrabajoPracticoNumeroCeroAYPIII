/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteraci�n y Cadenas.				
 * Ejercicio 19:
 * c) Escribir un m�todo static String reversa(String cadena) que dado un String, 
 * devuelve otro String con los caracteres invertidos. Por ejemplo, reversa(``hola'') deber�
 * devolver el String `` aloh''.
 * d) Modificar el m�todo imprimirReversa para que utilice el m�todo definido en el punto
 * anterior.
 *    
 */

package ejercicio19;

import unpaz.ayp3.Consola;

public class Ejercicio19CYD {

	public static void main(String[] args) 
	{
		String cadena = Consola.pedirTexto("Ingrese una palabra: ");
		String inversa = reversa(cadena);
		
		System.out.println(inversa);
	}
	public static String reversa(String cadena)
	{	
		String  nuevaCadena = "";
		char indice;
		
		for(int i=cadena.length()-1; i>=0; i--)
		{
			indice = cadena.charAt(i);
			nuevaCadena = nuevaCadena + indice;
		}
		return nuevaCadena;
	}
}