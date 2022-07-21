/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 18:
 * Escribir las versiones iterativas de los siguientes métodos:
 * b) sumatoriaPares: static int iterSumatoriaPares(int n).
 *    
 */

package ejercicio18;

import unpaz.ayp3.Consola;

public class Ejercicio18B {

	public static void main(String[] args)
	{
		int numero = Consola.pedirEntero("Ingrese un numero par");
		
		System.out.println("La suma de numeros pares es: "+iterSumatoriaPares(numero));
	}

	public static int iterSumatoriaPares(int n)
	{
		int acumulador=0;
		int i=0;
		
		do 
		{
			acumulador=i+2;
			i++;
			
		} while(i <= n);
		
		return acumulador;
	}
}
