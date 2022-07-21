/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos y condicionales.				
 * Ejercicio 7:
 * Análogamente al ejercicio anterior, escribir un método static void imprimirPromedio(int a, int b)
 * que imprima el promedio de los dos parámetros.
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
