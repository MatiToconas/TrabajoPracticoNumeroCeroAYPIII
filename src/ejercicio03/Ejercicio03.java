/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 3:
 * Escribir un programa que te pregunte por dos n�meros, y a continuaci�n imprima un mensaje
 * del estilo "La suma es: " y el valor de la suma de ambos n�meros. Para leer un entero de pantalla,
 * utilizar el m�todo Consola.pedirEntero() de la librer�a de la materia.
 *    
 */
package ejercicio03;

import unpaz.ayp3.Consola;

public class Ejercicio03 {

	public static void main(String[] args) 
	{
		int valorX = Consola.pedirEntero("Ingrese un numero entero");
		int valorY = Consola.pedirEntero("Ingrese otro numero entero");

		int suma = valorX + valorY;
		
		System.out.println("La suma es: "+suma);
	}
}
