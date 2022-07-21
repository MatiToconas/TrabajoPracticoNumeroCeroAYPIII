/* Alumnos: Tocon�s Mat�as.
 * Instituci�n: Universidad Nacional de Jos� Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: M�todos y condicionales.				
 * Ejercicio 26:
 * La sucesi�n de Fibonacci es una sucesi�n de n�meros naturales que describe, por ejemplo, el
 * n�mero de individuos en una poblaci�n de conejos tras varias generaciones. Esta sucesi�n tiene
 * la particularidad de estar presente en muchos elementos de la naturaleza, y que a medida que
 * se aproxima al infinito, el cociente entre dos elementos consecutivos, se aproxima a la proporci�n
 * �urea. Los numeros de la sucesi�n se obtienen de la siguiente manera:
 * f0 = 0
 * f1 = 1
 * fn = fn-2 + fn-1
 * Los primeros n�meros de la sucesi�n ser�an entonces: 0; 1; 1; 2; 3; 5; 8; 13; 21; ......
 * Implementar el m�todo que devuelve el n-�simo elemento de la sucesi�n:
 * a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
 * b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)
 * Responder:
 * a) Comparar los tiempos entre una implementaci�n y otra. �Cu�l es el t�rmino m�s
 * grande que puede calcular cada una de las implementaciones en un tiempo menor a
 * 10 segundos? �Hay diferencia? �Te imaginas por qu�?
 * b) �Cu�nto vale f47? Interpret� este resultado.  
 */

package ejercicio26;

import java.util.*;

public class Ejercicio26 {

	public static void main(String[] args) 
	{
		Scanner f = new Scanner (System.in);
		int n;
		Ejercicio26 p = new Ejercicio26();
		System.out.print("Ingrese La Cantidad De Resultados Que Desea Ver De La Sucesi�n Fibonacci: ");
		n = f.nextInt();		
		
		 //Mostrar Recursivo
		System.out.println(">>> Recursivo <<<");
		 
		for(int i=0; i <=n ; i++)
		{
			
			System.out.print(+FibRec(i)+",");
		}

		//Mostrar Iteracion
		System.out.println(" ");
		System.out.println(">>> Iteraci�n <<<");
		FibIter(n);
		
		System.out.println(" ");
		System.out.print("La sucesion Fibonacci de 47 Mediante Recursividad es: " + p.FibRec(47));
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("La sucesion Fibonacci de 47 Mediante Ciclo es: " +p.FibIter(47));
		}
	
	//Metodo Recursivo para la Sucesi�n Fibonacci
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
