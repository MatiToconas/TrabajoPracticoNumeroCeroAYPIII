/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 2:
 * Escribir un programa que te pregunte tu nombre y a continuaci�n imprima un saludo del estilo 
 * "Hola [nombre]". Para leer un texto por teclado, utilizar el m�todo Consola.pedirTexto() de la
 * librer�a de la materia.
 *    
 */

package ejercicio02;

import unpaz.ayp3.Consola;

public class Ejercicio02 {

	public static void main(String[] args) 
	{
		String nombre = Consola.pedirTexto("�Como es tu nombre?");
		
		System.out.println("Hola "+nombre);
	}
}
