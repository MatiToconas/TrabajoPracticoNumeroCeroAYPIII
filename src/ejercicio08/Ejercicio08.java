/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 8:
 * Escribir un m�todo static void ponerNota(double x, double y) que toma dos n�meros 
 * decimales y los promedia. En caso que el promedio sea mayor o igual a 7, deber�a 
 * imprimir``Promocionado'', si es mayor o igual a 4 pero menor que 7, imprime ``Aprobado'' y si es menor
 * que 4 imprime ``Debe recuperar''. Probarla llam�ndola desde el main con distintos n�meros.
 * Luego, pedirle �mbos n�meros al usuario con el m�todo Consola.pedirDecimal() para pas�rselos
 * a ponerNota.
 *    
 */
package ejercicio08;

import unpaz.ayp3.Consola;

public class Ejercicio08 {

	public static void main(String[] args) 
	{
		double x = Consola.pedirDecimal("Ingrese un numero decimal");
		double y = Consola.pedirDecimal("Ingrese otro numero decimal");
		
		ponerNota(x,y);
	}
	
	public static void ponerNota(double x, double y) 
	{
		double promedio = (x + y) / 2;
		
		if(promedio >= 7)
		{
			System.out.println("Promocionado");
		}
		else if(promedio >= 4 && promedio < 7)
		{
			System.out.println("Aprobado");
		}
		else 
		{
			System.out.println("Debe recuperar");
		}
	}
}