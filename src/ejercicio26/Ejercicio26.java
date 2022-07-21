/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos y condicionales.				
 * Ejercicio 26:
 * La sucesión de Fibonacci es una sucesión de números naturales que describe, por ejemplo, el
 * número de individuos en una población de conejos tras varias generaciones. Esta sucesión tiene
 * la particularidad de estar presente en muchos elementos de la naturaleza, y que a medida que
 * se aproxima al infinito, el cociente entre dos elementos consecutivos, se aproxima a la proporción
 * áurea. Los numeros de la sucesión se obtienen de la siguiente manera:
 * f0 = 0
 * f1 = 1
 * fn = fn-2 + fn-1
 * Los primeros números de la sucesión serían entonces: 0; 1; 1; 2; 3; 5; 8; 13; 21; ......
 * Implementar el método que devuelve el n-ésimo elemento de la sucesión:
 * a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
 * b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)
 * Responder:
 * a) Comparar los tiempos entre una implementación y otra. ¿Cuál es el término más
 * grande que puede calcular cada una de las implementaciones en un tiempo menor a
 * 10 segundos? ¿Hay diferencia? ¿Te imaginas por qué?
 * b) ¿Cuánto vale f47? Interpretá este resultado.  
 */

package ejercicio26;

import java.util.*;

public class Ejercicio26 {

	public static void main(String[] args) 
	{
		Scanner f = new Scanner (System.in);
		int n;
		Ejercicio26 p = new Ejercicio26();
		System.out.print("Ingrese La Cantidad De Resultados Que Desea Ver De La Sucesión Fibonacci: ");
		n = f.nextInt();		
		
		 //Mostrar Recursivo
		System.out.println(">>> Recursivo <<<");
		 
		for(int i=0; i <=n ; i++)
		{
			
			System.out.print(+FibRec(i)+",");
		}

		//Mostrar Iteracion
		System.out.println(" ");
		System.out.println(">>> Iteración <<<");
		FibIter(n);
		
		System.out.println(" ");
		System.out.print("La sucesion Fibonacci de 47 Mediante Recursividad es: " + p.FibRec(47));
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("La sucesion Fibonacci de 47 Mediante Ciclo es: " +p.FibIter(47));
		}
	
	//Metodo Recursivo para la Sucesión Fibonacci
	public static int FibRec (int n)
	{
		if (n == 0)
		{
			return 0;
		}
			
		if (n==1 || n==2)
		{
			//caso base 
			return 1;
		}
		else
		{ 
			//caso Recursivo
			return FibRec(n-2) + FibRec(n-1);
		}
	}

	public static int FibIter(int n)
	{
		int fibo = 0; 
		int primero = 1;
		int segundo = 0;
	
		for (int i=1; i<=n; i++)
	{
		System.out.print(fibo+",");
		fibo = primero + segundo;
		primero = segundo;
		segundo = fibo;
	}
	return fibo;
	}
}
