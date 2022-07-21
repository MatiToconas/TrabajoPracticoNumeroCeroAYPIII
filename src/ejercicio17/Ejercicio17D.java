/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos con resultados y recursividad.				
 * Ejercicio 17:
 * Si no lo hizo de esa manera en los ejercicios anteriores, escribir las versiones recursivas de los
 * siguientes métodos:
 * d) factorial: static int recurFactorial(int n).
 *    
 */

package ejercicio17;

import unpaz.ayp3.Consola;

public class Ejercicio17D {

	public static void main(String[] args) 
	{
		int numeroEntero = Consola.pedirEntero("Ingrese un numero entero");
		
		int resultadoFactorial = recurFactorial(numeroEntero);
		
		System.out.println("El factoria de "+numeroEntero+" es: "+resultadoFactorial);
	}
	
	public static int recurFactorial(int n)
	{
		int resultado;
		
		if(n==0)
		{
			return 1;
		}
		else
		{
			resultado=n*recurFactorial(n-1);
		}
		return resultado;
	}
}
