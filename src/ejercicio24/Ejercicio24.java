/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 24:
 * Escribir un método static boolean esSinRepetidos(String s) que dada una cadena, devuelve
 * true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. No utilizar el método
 * del ejercicio 25.
 *    
 */

package ejercicio24;

import unpaz.ayp3.Consola;

public class Ejercicio24 {

	public static void main(String[] args) 
	{
		String palabra = Consola.pedirTexto("Ingrese una palabra");
		
		 if (esSinRepetidos(palabra) == true)
		 {
			 System.out.printf("Es Verdadero no hay carecteres repetidos", palabra);
		 }
		 else 
		 {
			 System.out.printf("Es Falso hay caracteres repetidos", palabra);
		 }	
	}
	
	public static boolean esSinRepetidos(String s)
	{
		char caracter;
		for (int i = 0; i <= s.length()-1; i++)
		{
			caracter = s.charAt(i);
			for (int j= i+1; j <= s.length()-1; j++)
			{
				if(s.charAt(j)== caracter)
				{
					return false;
				}
			}
		}
		return true;
	}
}
