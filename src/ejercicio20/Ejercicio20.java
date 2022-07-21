/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 20:
 * Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena
 * y un caracter, cuenta la cantidad de veces que aparece c en s.
 *    
 */

package ejercicio20;

import unpaz.ayp3.Consola;
import java.util.*;

public class Ejercicio20 {

	public static void main(String[] args) 
	{		
		String palabra = Consola.pedirTexto("Ingrese una palabra: ");
		System.out.println("Ingrese una letra: ");
		Scanner caracter = new Scanner(System.in);
		char letra = caracter.next().charAt(0);	
		
		int acumulador = cantidadApariciones(palabra,letra);
		System.out.println("La cantidad de letra C que aparece en String es: "+acumulador);
	}

	public static int cantidadApariciones(String s, char c)
	{
		int contador=0;
		for(int i=0; i<=s.length()-1;i++)
		{
			if (s.charAt(i)=='c')
			{
				contador++;
			}
		}
		return contador;
	}
}
