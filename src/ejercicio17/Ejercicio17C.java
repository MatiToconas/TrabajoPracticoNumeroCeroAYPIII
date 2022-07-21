/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos con resultados y recursividad.				
 * Ejercicio 17:
 * Si no lo hizo de esa manera en los ejercicios anteriores, escribir las versiones recursivas de los
 * siguientes m�todos:
 * c) potencia: static int recurPotencia(int n).
 *    
 */

package ejercicio17;

import unpaz.ayp3.Consola;

public class Ejercicio17C {

	public static void main(String[] args) 
	{
		double racional = Consola.pedirDecimal("Ingrese base de la potencia");
		int entero = Consola.pedirEntero("Ingrese el exponente de la potencia");
		
		double calculo = recurPotencia(racional, entero);
		
		System.out.println("La potencia por medio de la recursivdad es: "+calculo);
	}

	public static double recurPotencia(double x, int a)
	{
		double resultado;
		
		if(a==0)
		{
			return 1;
		}
		else 
		{
			resultado = x*recurPotencia(x, a-1);
		}
		return resultado;
	}
}
