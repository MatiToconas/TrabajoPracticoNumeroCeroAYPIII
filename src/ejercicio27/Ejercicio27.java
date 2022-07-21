/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 27:
 * La sucesi�n de Collatz se define de la siguiente manera. Se comienza del n�mero n y se prosigue
 * as�:
 * Si n es par, entonces el siguiente n�mero es n=2
 * Si n es impar, entonces el siguiente n�mero es 3 * n + 1
 * Cuando n vale 1, no hay siguiente n�mero.
 * Escribir un m�todo static void collatz(int n) que toma un natural n e imprime, en l�neas
 * separadas, los n�meros de la sucesi�n.
 *    
 */

package ejercicio27;

import java.util.*;

public class Ejercicio27 {

	//Pide un numero por pantalla y muestra la sucesion Collatz
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in);
		
		System.out.println(" Ingrese un numero: ");
		int numero = n.nextInt();
		
		collatz(numero);
	}
	//Calcula la sucesion Collatz
	public static void collatz(int n)
	{
		while(n!=1)
		{
			if(n % 2 == 0)
			{
				n = n/2;
			}
			else
			{
				n = n*3+1;
			}
			System.out.print(" "+n);
		}
	}
}
