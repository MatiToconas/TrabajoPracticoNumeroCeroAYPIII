/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos con resultados y recursividad.				
 * Ejercicio 12:
 * Escribir un m�todo static boolean esDivisible(int n, int m) que devuelve true si n es 
 * divisible por m y false en caso contrario. Probarlo adecuadamente llam�ndola desde el main.
 *    
 */

package ejercicio12;

import unpaz.ayp3.Consola;

public class Ejercicio12 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");
		int m = Consola.pedirEntero("Ingrese un nuevo numero");
		
		if(esDivisible(n,m) == true)
		{
			System.out.println(n+" Es divisible por "+m);
		}
		else
		{
			System.out.println(n+" No es divisible por "+m);
		}
	}

	public static boolean esDivisible(int n, int m) 
	{
		if(n % m == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
