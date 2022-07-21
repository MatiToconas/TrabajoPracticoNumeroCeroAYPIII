/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos con resultados y recursividad.				
 * Ejercicio 11:
 * Escribir un método static int cantCifras(int n) que devuelve la cantidad de cifras de n.
 * Probarlo adecuadamente llamándola desde el main.
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
