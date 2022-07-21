/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 5:
 * Escribir un programa que te pregunte por dos n�meros, y a continuaci�n imprima un mensaje
 * del estilo "El promedio es: " y el valor del promedio de ambos n�meros.
 *    
 */
package ejercicio05;

import unpaz.ayp3.Consola;

public class Ejercicio05 {

	public static void main(String[] args) 
	{
		int valorX = Consola.pedirEntero("Ingrese un valor");
		int valorY = Consola.pedirEntero("Ingrese otro valor");
		
		float promedio = (valorX + valorY) / 2;
		System.out.println("El promedio: "+promedio);
	}

}
