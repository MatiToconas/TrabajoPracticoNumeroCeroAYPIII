/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteraci�n y Cadenas.				
 * Ejercicio 18:
 * Escribir las versiones iterativas de los siguientes m�todos:
 * a) sumatoria: static int iterSumatoria(int n).
 *    
 */

package ejercicio18;

import unpaz.ayp3.Consola;

public class Ejercicio18A {

	public static void main(String[] args)
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("La sumatoria es: "+iterSumatoria(n));
	}
	
	public static int iterSumatoria(int n)
	{
		int acumulador=0;
		int i=0;
		
		while(i <= n) 
		{
			acumulador=acumulador+i;
			i++;
		}
		return acumulador;
	}
}
