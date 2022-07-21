/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 18:
 * Escribir las versiones iterativas de los siguientes métodos:
 * d) factorial: static int iterFactorial(int n).
 *    
 */

package ejercicio18;

import unpaz.ayp3.Consola;

public class Ejercicio18D {

	public static void main(String[] args) 
	{
		int numero = Consola.pedirEntero("Ingrese un numero entero");
		
		System.out.println("El resultado del factorial es: "+iterFactorial(numero));
	}
	public static int iterFactorial(int n)
	{
		int factorial=1;
		
		while (n!=0)
		 {
	  		factorial=factorial*n;
	  		n--;
		}
		return factorial;
	}
}
