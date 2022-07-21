/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos con resultados y recursividad.				
 * Ejercicio 11:
 * Escribir un m�todo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
 * Probarlo adecuadamente llam�ndola desde el main.
 *    
 */
package ejercicio11;

import unpaz.ayp3.Consola;

public class Ejercicio11 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		
		System.out.println("La cantidad de cifras es: "+cantCifras(n));
	}
	
	public static int cantCifras(int n) 
	{
		if (n < 10)
		{
			return 1;
		}
		
		if (n >= 10 && n < 100)
		{
			return 2;
		}
		
		if (n >= 100 && n < 1000)
		{
			return 3;
		}
		if (n >= 1000 && n < 10000)
		{
			return 4;
		}
		
		return 0;
	}
}
