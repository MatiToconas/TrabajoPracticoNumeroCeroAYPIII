/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos con resultados y recursividad.				
 * Ejercicio 15:
 * Escribir un método static double potencia(double x, int a) que toma un número racional
 * x y un entero a y calcula xa.
 *    
 */

package ejercicio15;

import unpaz.ayp3.Consola;

public class Ejercicio15 {

	public static void main(String[] args) 
	{
		double x = Consola.pedirDecimal("Ingrese un numero");
		int a = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("El resultado de la potencia es: "+potencia(x,a));
	}
	
	public static double potencia(double x, int a)
	{
		double potencia = Math.pow(x, a);
		return potencia;
	}
}	