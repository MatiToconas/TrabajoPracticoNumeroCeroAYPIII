/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos y condicionales.				
 * Ejercicio 27:
 * La sucesión de Collatz se define de la siguiente manera. Se comienza del número n y se prosigue
 * así:
 * Si n es par, entonces el siguiente número es n=2
 * Si n es impar, entonces el siguiente número es 3 * n + 1
 * Cuando n vale 1, no hay siguiente número.
 * Escribir un método static void collatz(int n) que toma un natural n e imprime, en líneas
 * separadas, los números de la sucesión.
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
