/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Iteración y Cadenas.				
 * Ejercicio 25:
 * Escribir un método static String sinRepetidos(String s) que dada una cadena, devuelve
 * una nueva cadena donde cada uno de los caracteres que aparecían en s, aparecen sólo una vez.
 * Se debe mantener la posición relativa de los caracteres: para aquellos que se encuentren repetidos
 * puede conservarse cualquiera de sus apariciones. Por ejemplo, para la palabra ``casos'' puede
 * devolver ``caso'' o ``caos'', conservando la primera o la segunda letra s respectivamente.
 *    
 */

package ejercicio25;

import unpaz.ayp3.Consola;

public class Ejercicio25 {

	public static void main(String[] args) 
	{
		String palabra = Consola.pedirTexto("Ingrese una palabra ");
		String resultadoFinal=sinRepetidos(palabra);
		
		System.out.println(resultadoFinal);
	}
	
	public static String sinRepetidos(String s)
	{
		String resultado = "";
		int bandera = 0;
		char indice=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			bandera=0;
			indice=s.charAt(i);
		
			for(int j=i+1; j<=s.length()-1; j++)
			{
				if(indice == s.charAt(j)) 
				{
				bandera++;
				}
			}
			if(bandera <=0)
			{
			resultado = resultado + indice;
			}
		}
		return resultado;
	}
}