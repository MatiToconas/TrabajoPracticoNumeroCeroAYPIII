/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 21:
 * Escribir un método static int cantidadVocales(String s) que dada una cadena que contiene
 * sólo letras minúsculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
 * utilizar el método definida en el ejercicio anterior.
 *    
 */

package ejercicio21;

import unpaz.ayp3.Consola;

public class Ejercicio21 {

	public static void main(String[] args) 
	{
		String cadena = Consola.pedirTexto("Ingrese una palabra: ");
		int cantidadFinal = cantidadVocales(cadena);
		System.out.println("La cantidad de vocales es: "+cantidadFinal);
	}

	public static int cantidadVocales(String s) 
	{
		int cantVocales = 0;
		
		for(int i=0 ; i < s.length(); i++)
		{
		if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			cantVocales++;
		}
		return cantVocales;
	}
}
