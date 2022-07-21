/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 7:
 * An�logamente al ejercicio anterior, escribir un m�todo static void imprimirPromedio(int a, int b)
 * que imprima el promedio de los dos par�metros.
 *    
 */
package ejercicio07;

import unpaz.ayp3.Consola;

public class Ejercicio07 {

	public static void main(String[] args) 
	{
		int valorX = Consola.pedirEntero("Ingrese un numero entero");
		int valorY = Consola.pedirEntero("Ingrese otro numero entero");
		
		imprimirPromedio(valorX,valorY);
	}
	
	public static void imprimirPromedio(int valorX, int valorY)
	{
		float promedio = (valorX + valorY) / 2;
		System.out.println("El promedio de los numeros ingresados es: "+promedio);
	}
}
