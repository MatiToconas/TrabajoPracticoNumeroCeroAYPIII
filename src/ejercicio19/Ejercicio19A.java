/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 19:
 * a) Escribir un programa que pida por pantalla un texto y a continuación lo imprima de
 * atrás para adelante. Para obtener las letras de una cadena de caracteres pueden 
 * utilizar el método charAt de String. Por ejemplo, cadena.charAt(0) devuelve el primer
 * caracter del String cadena.
 *    
 */

package ejercicio19;

import unpaz.ayp3.Consola;

public class Ejercicio19A {

	public static void main(String[] args) 
	{
		String cadena = Consola.pedirTexto("Ingrese un texto");
		
		for(int i=cadena.length()-1; i>=0; i--)
		{
			System.out.print(cadena.charAt(i));
		}
	}
}
