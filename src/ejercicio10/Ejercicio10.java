/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos con resultados y recursividad.				
 * Ejercicio 10:
 * a) Escribir un programa que te pregunte por un número e imprima un mensaje de tipo "[x] es
 * par" si el número es par (reemplazando [x] por el número en cuestión). En caso contrario, debe
 * imprimir "[x] es impar".
 * b) Crear un método static boolean esPar(int n) que devuelve true si n es par, y false en caso
 * contrario.
 * c) Modificar el main del programa para que utilice este método.
 *    
 */

package ejercicio10;

import unpaz.ayp3.Consola;

public class Ejercicio10 {

	public static void main(String[] args) 
	{
		int n = Consola.pedirEntero("Ingrese un numero");

/*	Ejercicio A)
 * 
 * 		if(n % 2 == 0)
		{
			System.out.println(n+" es par ");
		}
		else 
		{
			System.out.println(n+" es impar ");
		}
*/		
		if(esPar(n) == true)
		{
			System.out.println(n+" es par ");
		}
		else 
		{
			System.out.println(n+" es impar ");
		}
	}
	
	public static boolean esPar(int n) 
	{	
		if(n % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
