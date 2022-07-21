/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos y condicionales.				
 * Ejercicio 8:
 * Escribir un método static void ponerNota(double x, double y) que toma dos números 
 * decimales y los promedia. En caso que el promedio sea mayor o igual a 7, debería 
 * imprimir``Promocionado'', si es mayor o igual a 4 pero menor que 7, imprime ``Aprobado'' y si es menor
 * que 4 imprime ``Debe recuperar''. Probarla llamándola desde el main con distintos números.
 * Luego, pedirle ámbos números al usuario con el método Consola.pedirDecimal() para pasárselos
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