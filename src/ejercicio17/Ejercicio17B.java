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
 * b) sumatoriaPares: static int recurSumatoriaPares(int n).
 *    
 */
package ejercicio17;

import unpaz.ayp3.Consola;

public class Ejercicio17B {

	public static void main(String[] args) 
	{
		int numeroEntero = Consola.pedirEntero("Ingrese un numero par");
		
		int sumaFinal = recurSumatoriaPares(numeroEntero);
		
		System.out.println("La sumatoria de pares es: "+sumaFinal);
	}

	public static int recurSumatoriaPares(int n)
	{
		int resultado;
		
		if(n==2)
		{
			return 2;
		}
		else
		{
			resultado = n + recurSumatoriaPares(n-2);
		}
		return resultado;
	}
}
