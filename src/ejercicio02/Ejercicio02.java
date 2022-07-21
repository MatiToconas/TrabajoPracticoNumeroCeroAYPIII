/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 2:
 * Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo 
 * "Hola [nombre]". Para leer un texto por teclado, utilizar el método Consola.pedirTexto() de la
 * librería de la materia.
 *    
 */

package ejercicio02;

import unpaz.ayp3.Consola;

public class Ejercicio02 {

	public static void main(String[] args) 
	{
		String nombre = Consola.pedirTexto("¿Como es tu nombre?");
		
		System.out.println("Hola "+nombre);
	}
}
