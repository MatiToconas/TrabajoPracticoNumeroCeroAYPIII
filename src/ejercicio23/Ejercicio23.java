/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 23:
 * Escribir el método static boolean esCapicua(String s) que dada una cadena, devuelve true
 * si la cadena es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve
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
