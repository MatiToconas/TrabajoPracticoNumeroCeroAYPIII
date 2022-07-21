/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos con resultados y recursividad.				
 * Ejercicio 14:
 * Escribir un m�todo static int sumatoriaPares(int n) que devuelve la sumatoria de los 
 * n�meros pares desde 2 hasta n. Nota: se puede usar el m�todo del ejercicio 10.
 *    
 */

package ejercicio14;

import unpaz.ayp3.Consola;

public class Ejercicio14 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("La suma de los numeros pares es: "+sumatoriaPares(n));
	}
	
	public static int sumatoriaPares(int n)
	{
		int acumulador=0;
		
		for(int i=0; i<=n; i++)
		{
			if(n % 2 == 0)
			{
				acumulador=acumulador+i;
			}
			else
			{
				System.out.println(" Es un numero impar ");
			}
		}
		return acumulador;
	}
}
