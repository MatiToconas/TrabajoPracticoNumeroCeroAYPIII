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
 * a) sumatoria: static int recurSumatoria(int n)
 *    
 */

package ejercicio17;

import unpaz.ayp3.Consola;

public class Ejercicio17A {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		int resultadoSuma=recurSumatoria(n);
		
		System.out.println("La sumatoria es: "+resultadoSuma);
	}
	
	public static int recurSumatoria(int n)
	{
		int resultado;
		
		if(n==1)
		{
			return 1;
		}
		else
		{
			resultado = n+recurSumatoria(n-1);
		}
		return resultado;
	}
}
