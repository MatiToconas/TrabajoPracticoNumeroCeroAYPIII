/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 6:
 * Escribir un m�todo static void imprimirSuma(int a, int b) que al igual que el ejercicio 4 
 * imprima la suma de los dos par�metros. Modificar el programa de dicho ejercicio para que utilice este
 * m�todo.
 *    
 */
package ejercicio06;

import unpaz.ayp3.Consola;

public class Ejercicio06 {

	public static void main(String[] args) 
	{
		int valorX = Consola.pedirEntero("Ingrese un numero entero");
		int valorY = Consola.pedirEntero("Ingrese otro numero entero");
		
		imprimirSuma(valorX,valorY);
	}

	public static void imprimirSuma(int valorX, int valorY) 
	{	
		int suma = valorX + valorY;
		System.out.println("La suma de los numeros ingresados es: "+suma);
	}
}