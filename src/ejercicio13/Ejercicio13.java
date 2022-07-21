/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos con resultados y recursividad.				
 * Ejercicio 13:
 * Escribir un m�todo static int sumatoria(int n) que devuelve la sumatoria de los n�meros
 * desde 1 hasta n.
 *    
 */

package ejercicio13;

import unpaz.ayp3.Consola;

public class Ejercicio13 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("La suma de los numeros es: "+sumatoria(n));
	}
	
	public static int sumatoria(int n) 
	{
		int acumulador=0;
		
		for(int i=0; i <= n; i++)
		{
			acumulador=acumulador+i;
		}
		return acumulador;
	}
}