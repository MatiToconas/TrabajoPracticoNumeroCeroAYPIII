/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 22:
 * Una palabra se dice que es "abecedaria" si las letras en la palabra aparecen en orden alfab�tico.
 * Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.
 * adi�s, af�n, afin�, �gil, bello, celos, cen�, chinos dijo, dimos, dios, fijos, finos, hijos, hilos,
 * himno
 * 1. Describ� un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma
 * contiene s�lo letras min�sculas.
 * 2. Implementar el algoritmo en un m�todo static boolean esAbecedaria(String s).
 * 3. �Funciona el algoritmo si le pasamos como parametro ``�gil''? En caso negativo, �por qu�
 * te parece que puede ser? �C�mo lo solucionar�as?
 *    
 */

package ejercicio22;

import unpaz.ayp3.Consola;

public class Ejercicio22 {

	public static void main(String[] args) 
	{
		String palabra = Consola.pedirTexto("Ingrese una palabra: ");
		
		 if (esSinRepetidos(palabra) == true)
		 {
			 System.out.printf("LA PALABRA ES ABECEDARIA");
		 }
		 else 
		 {
			 System.out.printf("LA PALABRA NO ES ABECEDARIA");
		 }
	}

	public static boolean esSinRepetidos(String s)
	{
		char caracter;
		for (int i = 0; i <= s.length()-1; i++)
		{
			caracter = s.charAt(i);
			for (int j = 0; j <= s.length()-1; j++)
			{
				if(caracter > s.charAt(i))
				{
					return false;
				}
			}
		}
		return true;
	}
}
