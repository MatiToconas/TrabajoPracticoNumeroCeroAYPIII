/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos con resultados y recursividad.				
 * Ejercicio 16:
 * Escribir un método static double factorial(int n) que toma un entero positivo n y calcula
 * n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
 * ejemplo 5! = 5 x 4 x 3 x 2 x 1 = 120. Ojo: por definición, el factorial de 0, es 1 (0! = 1).
 *    
 */

package ejercicio16;

import unpaz.ayp3.Consola;

public class Ejercicio16 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("El resultado del factorial es: "+factorial(n));
	}
	
	public static double factorial(int n)
	{
		int factorial=1;
		
		for (int i=2; i<=n; i++)
		{
			  factorial = factorial * i;
		}
		return factorial;
	}
}
