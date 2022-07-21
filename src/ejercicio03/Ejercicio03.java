/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 3:
 * Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje
 * del estilo "La suma es: " y el valor de la suma de ambos números. Para leer un entero de pantalla,
 * utilizar el método Consola.pedirEntero() de la librería de la materia.
 *    
 */
package ejercicio03;

import unpaz.ayp3.Consola;

public class Ejercicio03 {

	public static void main(String[] args) 
	{
		int valorX = Consola.pedirEntero("Ingrese un numero entero");
		int valorY = Consola.pedirEntero("Ingrese otro numero entero");

		int suma = valorX + valorY;
		
		System.out.println("La suma es: "+suma);
	}
}
