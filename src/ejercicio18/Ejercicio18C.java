/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 18:
 * Escribir las versiones iterativas de los siguientes métodos:
 * c) potencia: static int iterPotencia(int n).
 *    
 */

package ejercicio18;

import unpaz.ayp3.Consola;

public class Ejercicio18C {

	public static void main(String[] args) 
	{
		int base = Consola.pedirEntero("Ingrese base de la potencia a calcular");
		int exponente = Consola.pedirEntero("Ingrese exponente de la potencia a calcular");
		
		System.out.println("El resultado de la potencia es "+iterPotencia(base,exponente));
	}
	
	public static int iterPotencia(int base, int exponente)
	{
		int resultado = 1;

	    for (int i = 1; i <= exponente; i++) 
	    {
	        resultado = resultado * base;
	    }
	    return resultado;
	}
}
