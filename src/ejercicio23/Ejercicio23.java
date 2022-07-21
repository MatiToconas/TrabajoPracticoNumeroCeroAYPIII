/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteraci�n y Cadenas.				
 * Ejercicio 23:
 * Escribir el m�todo static boolean esCapicua(String s) que dada una cadena, devuelve true
 * si la cadena es igual de atr�s hacia adelante o de adelante hacia atr�s. En caso contrario, devuelve
 * false.
 *    
 */

package ejercicio23;

import unpaz.ayp3.Consola;

public class Ejercicio23 {

	public static void main(String[] args) 
	{
		String palabra = Consola.pedirTexto("Ingrese una palabra ");
		
		if (esCapicua(palabra) == false)
		{
			System.out.printf("La palabra no es capicua", palabra);
		}
		else
		{
			System.out.printf("La palabra es capicua", palabra);
		}
	}

	public static boolean esCapicua(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)!= s.charAt(s.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
}
